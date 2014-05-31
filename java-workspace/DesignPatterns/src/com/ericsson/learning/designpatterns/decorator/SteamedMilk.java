package com.ericsson.learning.designpatterns.decorator;

/**
 * DECORATOR: Concrete Decorator
 * */
public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Steamed milk";
    }

    @Override
    public double cost() {
        return 0.10 + this.beverage.cost();
    }
}
