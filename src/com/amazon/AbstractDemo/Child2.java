package com.amazon.AbstractDemo;

public class Child2 extends Parent {

    public Child2() {
        System.out.println("Calling child-2 constructor");
    }
    public void career(String name) {
        System.out.println("[Child2] Hello " + name + " from Child2");
    }

    public void partner(String isOk) {
        System.out.println("[Child2] She is " + isOk + " with him");
    }
}
