package com.ericsson.learning.designpatterns.facade.appliances;

public class Projector {
    public void on() {
        System.out.println("Turning projector on");
    }

    public void wideScreenMode() {
        System.out.println("Setting projector to wide screen mode");
    }

    public void off() {
        System.out.println("Turning projector off");
    }
}
