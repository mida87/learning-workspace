package com.ericsson.learning.designpatterns.command.appliances;

/**
 * COMMAND: Receiver - handles requests
 * */
public class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("Setting CD function");
    }

    public void setDvd() {
        System.out.println("Setting DVD function");
    }

    public void setRadio() {
        System.out.println("Setting Radio function");
    }

    public void setVolume(int level) {
        System.out.println("Setting Volume to specified value " + level);
    }
}
