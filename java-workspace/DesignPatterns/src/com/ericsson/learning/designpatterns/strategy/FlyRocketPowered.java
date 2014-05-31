package com.ericsson.learning.designpatterns.strategy;

/**
 * STRATEGY: Concrete Strategy
 * */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
