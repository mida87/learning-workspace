package com.ericsson.learning.designpatterns.factory.abstractfactory;

import com.ericsson.learning.designpatterns.factory.abstractfactory.pizzas.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
