package com.ericsson.learning.designpatterns.facade.appliances;

public class PopcornPopper {
    public void on() {
        System.out.println("Turning popper on");
    }

    public void pop() {
        System.out.println("Popping popcorns");
    }

    public void off() {
        System.out.println("Turning popper off");
    }
}
