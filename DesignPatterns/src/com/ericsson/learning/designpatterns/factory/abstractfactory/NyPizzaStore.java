package com.ericsson.learning.designpatterns.factory.abstractfactory;

import com.ericsson.learning.designpatterns.factory.abstractfactory.pizzas.*;

/**
 * ABSTRACT FACTORY: Client which uses abstract factory and abstract product
 * */
public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY Style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY Style Clam Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY Style Pepperoni Pizza");
        }

        return pizza;
    }
}
