package com.ericsson.learning.designpatterns.state;

import java.util.Random;

/**
 * STATE: Concrete State
 * */
public class HasQuarterState extends State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine machine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned..");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (machine.getCount() > 1)) {
            machine.setState(machine.getWinnerState());
        }
        else {
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void refill() {

    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
