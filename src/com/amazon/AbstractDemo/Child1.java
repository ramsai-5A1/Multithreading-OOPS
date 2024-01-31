package com.amazon.AbstractDemo;

public class Child1 extends Parent {

    public Child1() {
        System.out.println("Calling child1 constructor");
    }
    @Override
    public void career(String name) {
        System.out.println("[Child1] Your name is: " + name);
    }

    @Override
    public void partner(String isOk) {
        System.out.println("[Child1] She is: " + isOk);
    }
}
