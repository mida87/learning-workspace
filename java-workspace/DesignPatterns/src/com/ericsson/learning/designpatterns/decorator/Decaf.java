package com.ericsson.learning.designpatterns.decorator;

/**
 * DECORATOR: Concrete Component
 * */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
