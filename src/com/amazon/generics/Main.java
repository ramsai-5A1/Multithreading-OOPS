package com.amazon.generics;

public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student(1, 123);
        Student obj2 = new Student(2, 240);
        if (obj1.compareTo(obj2) < 0) {
            System.out.println("1 is lesser than 2");
        }
    }
}
