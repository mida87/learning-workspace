package com.ericsson.learning.designpatterns.strategy;

/**
 * STRATEGY: Concrete Strategy
 * */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
