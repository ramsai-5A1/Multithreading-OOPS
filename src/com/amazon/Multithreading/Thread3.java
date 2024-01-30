package com.amazon.Multithreading;

public class Thread3 implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 7; i++) {
            System.out.println("Inside " + Thread.currentThread().getName() + " " + i);
        }
    }
}
