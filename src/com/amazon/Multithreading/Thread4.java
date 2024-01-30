package com.amazon.Multithreading;

public class Thread4 implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " " + i);
        }
    }
}
