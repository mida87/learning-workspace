package com.ericsson.learning.designpatterns.factory.abstractfactory;

import com.ericsson.learning.designpatterns.factory.abstractfactory.ingredients.*;

/**
 * ABSTRACT FACTORY: Factory interface that delegates creation to concrete factories
 * */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
