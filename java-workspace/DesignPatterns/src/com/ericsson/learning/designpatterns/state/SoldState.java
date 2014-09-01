package com.ericsson.learning.designpatterns.state;

/**
 * STATE: Concrete State
 * */
public class SoldState extends State {
    GumballMachine machine;

    public SoldState(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoQuarterState());
        }
        else {
            System.out.println("Oops out of gumballs");
            machine.setState(machine.getSoldOutState());
        }
    }

    @Override
    public void refill() {

    }

    public String toString() {
        return "dispensing a gumball";
    }
}
