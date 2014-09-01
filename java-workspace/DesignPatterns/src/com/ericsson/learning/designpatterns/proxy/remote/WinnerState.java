package com.ericsson.learning.designpatterns.proxy.remote;

public class WinnerState extends State {
    private static final long serialVersionUID = 2L;

    transient GumballMachine machine;

    public WinnerState(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }

    @Override
    public void dispense() {
        System.out.println("YOU ARE A WINNER! You've get two balls for your quarter");
        machine.releaseBall();
        if (machine.getCount() == 0) {
            machine.setState(machine.getSoldOutState());
        } else {
            machine.releaseBall();
            if (machine.getCount() == 0) {
                machine.setState(machine.getSoldOutState());
            }
            else {
                machine.setState(machine.getNoQuarterState());
            }
        }
    }

    @Override
    public void refill() {

    }

    public String toString() {
        return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
    }
}
