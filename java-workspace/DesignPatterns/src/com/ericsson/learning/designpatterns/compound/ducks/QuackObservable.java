package com.ericsson.learning.designpatterns.compound.ducks;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
