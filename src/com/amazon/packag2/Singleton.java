package com.amazon.packag2;

public class Singleton {
    private Singleton() {
        System.out.println("Object created");
    }
    private static Singleton instance;

    public static Singleton giveMeInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        System.out.println("Instance is returning");
        return instance;
    }
}
