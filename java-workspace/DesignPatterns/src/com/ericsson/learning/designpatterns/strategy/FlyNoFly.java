package com.ericsson.learning.designpatterns.strategy;

/**
 * STRATEGY: Concrete Strategy
 * */
public class FlyNoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
