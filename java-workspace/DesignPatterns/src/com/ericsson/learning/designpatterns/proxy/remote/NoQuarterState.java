package com.ericsson.learning.designpatterns.proxy.remote;

public class NoQuarterState extends State {
    private static final long serialVersionUID = 2L;

    transient GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        machine.setState(machine.getHasQuarterState());

    }

    @Override
    public void refill() {

    }

    public String toString() {
        return "waiting for quarter";
    }
}
