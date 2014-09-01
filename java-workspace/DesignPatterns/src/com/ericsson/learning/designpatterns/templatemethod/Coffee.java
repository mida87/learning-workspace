package com.ericsson.learning.designpatterns.templatemethod;

/**
 * TEMPLATE METHOD: Concrete Class - implements specific algorithm steps by overriding primitive methods
 * */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
