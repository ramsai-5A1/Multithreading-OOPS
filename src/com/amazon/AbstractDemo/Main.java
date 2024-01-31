package com.amazon.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        child1.partner("Fine");
        child1.career("Doctor");

        child2.partner("Not fine");
        child2.career("Engineer");
    }
}
