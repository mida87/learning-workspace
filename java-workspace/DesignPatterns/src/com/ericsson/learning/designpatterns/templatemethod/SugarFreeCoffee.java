package com.ericsson.learning.designpatterns.templatemethod;

public class SugarFreeCoffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.err.println("Should not end up here");
    }

    protected boolean customerWantsCondiments() {
        return false;
    }
}
