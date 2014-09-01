package com.ericsson.learning.designpatterns.state;

/**
 * STATE: Concrete State
 * */
public class SoldOutState extends State {
    GumballMachine machine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.err.println("Gumball machine is out of order");
    }

    @Override
    public void ejectQuarter() {
        System.err.println("Gumball machine is out of order");
    }

    @Override
    public void turnCrank() {
        System.err.println("Gumball machine is out of order");
    }

    @Override
    public void dispense() {
        System.err.println("Gumball machine is out of order");
    }

    @Override
    public void refill() {
        machine.setState(machine.getNoQuarterState());
    }

    public String toString() {
        return "sold out";
    }
}
