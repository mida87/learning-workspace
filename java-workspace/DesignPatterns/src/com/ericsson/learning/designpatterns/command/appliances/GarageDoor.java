package com.ericsson.learning.designpatterns.command.appliances;

/**
 * COMMAND: Receiver - handles requests
 * */
public class GarageDoor {
    public void up() {
        System.out.println("Garage Door is Open");
    }

    public void down() {
        System.out.println("Garage Door is Closed");
    }

    public void stop() {
        System.out.println("Garage Door stopped");
    }

    public void lightOn() {
        System.out.println("Lights on in Garage");
    }

    public void lightOff() {
        System.out.println("Lights off in Garage");
    }
}
