package com.amazon.polymorphism;

public class ObjectPrint {
    int value;

    public ObjectPrint() {
        value = 10;
    }

    @Override
    public String toString() {
        return "Value is: " + this.value;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint();
        System.out.println(obj);
    }
}
