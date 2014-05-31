package com.ericsson.learning.designpatterns.facade.appliances;

public class DvdPlayer {
    String movie;

    public void on() {
        System.out.println("Turning DVD player on");
    }

    public void playMovie(String movie) {
        System.out.println("Playing movie " + movie + " on DVD Player");
        this.movie = movie;
    }

    public void stop() {
        System.out.println("Stopping currently playing movie " + movie);
    }

    public void eject() {
        System.out.println("Eject movie from DVD player");
        movie = null;
    }

    public void off() {
        System.out.println("Turning DVD Player off");
    }
}
