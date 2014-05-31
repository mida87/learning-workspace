package com.ericsson.learning.designpatterns.facade.appliances;

public class TheaterLights {
    public void dim(int i) {
        System.out.println("Dimming lights to " + i + "%");
    }

    public void on() {
        System.out.println("Turning lights on");
    }
}
