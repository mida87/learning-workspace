package com.ericsson.learning.designpatterns.templatemethod;

/**
 * TEMPLATE METHOD: Abstract class - hold main algorithm but delegates specific parts to subclasses (primitive methods)
 * */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();
}
