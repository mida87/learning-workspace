package com.ericsson.learning.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * OBSERVER: Concrete Observer
 * */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Average temperature is: " + temperature + " degrees");
    }
}
