package com.ericsson.learning.designpatterns.decorator;

/**
 * DECORATOR: Component
 * */
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
