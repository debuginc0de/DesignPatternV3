package com.tech.designPatterns.behavioral.ChainOfResponsibility;


/**
 Allows Multiple Objects to handle a request without the sender needing to know which object ultimately
process it.

 Think of technical support:
 Level 1 support tries to handle the issue.
 If it cannot, it escalates to Level 2 support.
 If not resolved, it goes to Level 3 support.
 **/

abstract class SupportHolders{
    protected SupportHolders nextHolders;

    public void setNextHolders(SupportHolders nextHolders) {
        this.nextHolders = nextHolders;
    }

    public abstract void handleRequest(String issue);
}

class Level1Support extends SupportHolders{

    @Override
    public void handleRequest(String issue) {
        if (issue.equalsIgnoreCase("password reset")){
            System.out.println("Level1 resolve "+issue);
        }
        else {
            System.out.println("not resolved");
        }
    }
}

class Level2Support extends SupportHolders{

    @Override
    public void handleRequest(String issue) {
        if (issue.equalsIgnoreCase("software update")){
            System.out.println("Level2 resolved "+issue);
        } else if (nextHolders!=null) {
            nextHolders.handleRequest(issue);
        }
    }
}
class Level3Support extends SupportHolders{

    @Override
    public void handleRequest(String issue) {
        if (issue.equalsIgnoreCase("server down")){
            System.out.println("Level3 Resolved "+issue);
        } else if (nextHolders!=null) {
            nextHolders.handleRequest(issue);
        }
    }
}

public class chainOfResponsibilityImpl {
    //Build the chain : Level1->Level2->Level3.
    public static void main(String[] args) {
        SupportHolders s1=new Level1Support();
        SupportHolders s2=new Level2Support();
        SupportHolders s3=new Level3Support();

        s1.setNextHolders(s2);
        s2.setNextHolders(s3);

        s1.handleRequest("password reset");
        s1.handleRequest("Software update");
        s1.handleRequest("server down");
        s1.handleRequest("Network issue");
    }
}
