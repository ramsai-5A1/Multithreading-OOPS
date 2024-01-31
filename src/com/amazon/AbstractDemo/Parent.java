package com.amazon.AbstractDemo;

public abstract class Parent {

    public Parent() {
        System.out.println("Calling Parent Constructor");
    }

    public static void printSomething() {
        System.out.println("Printing something from parent class");
    }

    public void normalFunction() {
        System.out.println("Normal function invoking from parent");
    }
    public abstract void career(String profession);
    public abstract void partner(String isOk);
}
