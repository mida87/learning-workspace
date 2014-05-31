package com.ericsson.learning.designpatterns.decorator;

/**
 * DECORATOR: Concrete Decorator
 * */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + this.beverage.cost();
    }
}
