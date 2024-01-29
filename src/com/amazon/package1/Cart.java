package com.amazon.package1;

public class Cart {
    public static int items = 0;

    public Cart() {
        Cart.items += 1;
    }
    public static void displayCart() {
        System.out.println("Your cart has 4 items");
    }
}
