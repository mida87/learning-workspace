package com.ericsson.learning.designpatterns.strategy;

/**
 * STRATEGY: Concrete Strategy
 * */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
