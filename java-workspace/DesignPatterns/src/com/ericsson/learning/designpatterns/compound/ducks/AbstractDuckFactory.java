package com.ericsson.learning.designpatterns.compound.ducks;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createReadheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
