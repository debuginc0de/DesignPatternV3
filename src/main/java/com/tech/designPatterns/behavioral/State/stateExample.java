package com.tech.designPatterns.behavioral.State;

//The State Pattern allows an object to change its behavior when its internal state changes.


interface TrafficLight{
    void showLight();
}
class GreenLight implements TrafficLight{
    public void showLight(){
        System.out.println("Green Light On");
    }
}
class RedLight implements TrafficLight{
    public void showLight(){
        System.out.println("Red Light On--stop");
    }
}
class YellowLight implements TrafficLight{
    public void showLight(){
        System.out.println("Yellow light on ---Get ready");
    }
}
class TrafficLightState{
    private TrafficLight trafficLight;

    public void setTrafficLight(TrafficLight trafficLight){
        this.trafficLight=trafficLight;
    }
    public void show(){
        trafficLight.showLight();
    }
}
public class stateExample {
    public static void main(String[] args) {
        TrafficLightState tfs=new TrafficLightState();
        tfs.setTrafficLight(new GreenLight());
        tfs.show();
        tfs.setTrafficLight(new RedLight());
        tfs.show();
        tfs.setTrafficLight(new YellowLight());
        tfs.show();
    }
}
