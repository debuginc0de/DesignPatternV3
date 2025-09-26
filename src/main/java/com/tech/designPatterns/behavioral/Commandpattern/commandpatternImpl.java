package com.tech.designPatterns.behavioral.Commandpattern;


import org.springframework.context.annotation.Primary;

//The Command Pattern is a behavioral design pattern where you encapsulate a request as an object.
//command interface
interface Command{
    void execute();
}
//receiver(TV)
class TV{
    public void turnOn(){
        System.out.println("ON TV");
    }
    public void turnoff(){
        System.out.println("OFF TV");
    }
    public void increaseVolume(){
        System.out.println("Increase Vol");
    }
}

//Concrete command
class TurnOnCommand implements Command {
    private TV tv;
    public TurnOnCommand(TV tv){this.tv=tv;}
    @Override
    public void execute() {
        tv.turnOn();
    }
}
class TurnOfCommand implements Command{
    private TV tv;
    public TurnOfCommand(TV tv){this.tv=tv;}
    @Override
    public void execute(){
        tv.turnoff();
    }
}
class VolumeIncreaseCommand implements Command{
    private TV tv;
    public VolumeIncreaseCommand(TV tv) { this.tv = tv; }
    public void execute() { tv.increaseVolume(); }
}
//invoke
class Remote{
    private Command command;
    public void SetCommand(Command command){
        this.command=command;
    }
    public void Pressbutton(){
    command.execute();
    }
}

public class commandpatternImpl {
    public static void main(String[] args) {
        TV tv=new TV();

        //comman create
        Command on=new TurnOnCommand(tv);
        Command of=new TurnOfCommand(tv);
        Command volincrease=new VolumeIncreaseCommand(tv);

        //Remote
        Remote remote=new Remote();

        //Press Button
        remote.SetCommand(on);
        remote.Pressbutton();
        remote.SetCommand(of);
        remote.Pressbutton();
        remote.SetCommand(volincrease);
        remote.Pressbutton();
    }
}
