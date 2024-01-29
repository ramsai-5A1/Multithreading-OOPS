package com.amazon.packag2;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.giveMeInstance();
        Singleton obj2 = Singleton.giveMeInstance();
        Singleton obj3 = Singleton.giveMeInstance();
        Singleton obj4 = Singleton.giveMeInstance();
    }
}
