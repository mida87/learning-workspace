package com.ericsson.learning.designpatterns.proxy.remote;

import java.io.Serializable;

public abstract class State implements Serializable {
    public void insertQuarter() {
        System.err.println("You cannot insert quarter at this point");
    }

    public void ejectQuarter() {
        System.err.println("You cannot eject quarter at this point");
    }

    public void turnCrank() {
        System.err.println("You cannot turn crank at this point");
    }

    public void dispense() {
    }

    public abstract void refill();
}
