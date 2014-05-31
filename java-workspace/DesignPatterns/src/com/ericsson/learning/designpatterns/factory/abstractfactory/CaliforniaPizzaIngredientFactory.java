package com.ericsson.learning.designpatterns.factory.abstractfactory;

import com.ericsson.learning.designpatterns.factory.abstractfactory.ingredients.*;

/**
 * ABSTRACT FACTORY: Concrete factory
 * */
public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new VeryThinCrust();
    }

    @Override
    public Sauce createSauce() {
        return new BruscettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClams() {
        return new Camari();
    }
}
