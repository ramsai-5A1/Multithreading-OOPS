package com.amazon.Kunal;

public class MainTester {
    public static void main(String[] args) {
        System.out.println("Main starting its execution");

        Vehicle obj1 = new Vehicle();
        System.out.println(obj1.horn + " " + obj1.engine);

        Bike obj2 = new Bike();
        System.out.println(obj2.wheels + " " + obj2.horn + " " + obj2.engine);

        //Bike obj3 = new Vehicle();
        Vehicle obj4 = new Bike();
        System.out.println(obj4.horn + " " + obj4.engine);

        System.out.println("Main ending its execution");
    }
}
