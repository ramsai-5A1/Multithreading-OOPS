package com.amazon.polymorphism;

public class Rectangle extends Shapes {

    @Override
    public void printArea() {
        System.out.println("Area is length * breadth");
    }
}
