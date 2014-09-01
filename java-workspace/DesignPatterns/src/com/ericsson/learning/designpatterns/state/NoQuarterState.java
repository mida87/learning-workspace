package com.ericsson.learning.designpatterns.state;

/**
 * STATE: Concrete State
 * */
public class NoQuarterState extends State {
    GumballMachine machine;

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
