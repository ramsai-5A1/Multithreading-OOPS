package com.amazon.DesignPatterns.HandleNullObject;

public class Car implements Vehicle {

    @Override
    public int getCapacity() {
        return 6;
    }

    @Override
    public int getMilage() {
        return 15;
    }
}
