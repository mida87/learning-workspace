package com.ericsson.learning.designpatterns.command.appliances;

/**
 * COMMAND: Receiver - handles requests
 * */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + "Ceiling fan on High speed");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + "Ceiling fan on Medium speed");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + "Ceiling fan on Low speed");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + "Ceiling fan off");
    }

    public int getSpeed() {
        return speed;
    }
}
