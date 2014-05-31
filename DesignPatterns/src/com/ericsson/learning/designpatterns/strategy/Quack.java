package com.ericsson.learning.designpatterns.strategy;

/**
 * STRATEGY: Concrete Strategy
 * */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
