package com.ericsson.learning.designpatterns.facade.appliances;

public class Amplifier {
    private int volume;

    public void on() {
        System.out.println("Turning amplifier on");
    }

    public void setDvD() {
        System.out.println("Setting amplifier to DVD function");
    }

    public void setSurroundSound() {
        System.out.println("Setting surround sound option");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void off() {
        System.out.println("Turning amplifier off");
    }
}
