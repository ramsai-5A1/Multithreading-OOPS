package com.amazon.Kunal;

public class Bike extends Vehicle {
    public int wheels;

    public Bike() {
        super();
        System.out.println("Bike constructor invoked");
        this.wheels = 2;
    }
}
