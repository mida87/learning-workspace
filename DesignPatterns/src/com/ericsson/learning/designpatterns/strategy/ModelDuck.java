package com.ericsson.learning.designpatterns.strategy;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoFly();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.printf("I'm a model duck");
    }
}
