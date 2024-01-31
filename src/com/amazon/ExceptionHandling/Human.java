package com.amazon.ExceptionHandling;

public class Human implements Cloneable {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
