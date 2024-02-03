package com.amazon.DesignPatterns.HandleNullObject;

public class NullObject implements Vehicle {

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public int getMilage() {
        return 0;
    }
}
