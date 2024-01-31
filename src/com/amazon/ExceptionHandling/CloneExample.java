package com.amazon.ExceptionHandling;

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human obj1 = new Human(12, "kumar");
        System.out.println(obj1.age + " " + obj1.name);
        Human obj2 = (Human) obj1.clone();
        obj2.age = 23;
        System.out.println(obj2.age + " " + obj2.name);
        System.out.println(obj1.age + " " + obj1.name);


    }
}
