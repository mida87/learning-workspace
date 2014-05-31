package com.ericsson.learning.designpatterns.factory.factorymethod;

/**
 * FACTORY METHOD: Creator has a factoryMethod which is implemented in concrete creators
 * */
public abstract class PizzaStore {


    // factory method
	abstract Pizza createPizza(String item);

    // anOperation - uses factory method
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
