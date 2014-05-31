package com.ericsson.learning.designpatterns.singleton;

/**
 * SINGLETON: Only one instance available in a JVM
 * */
public class Singleton {
    // static reference to itself
    private static Singleton uniqueInstance;

    // constructor is private
    private Singleton() {}

    // getInstance retrieves one and only instance of a class - it is synchronized because of thread safety
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
