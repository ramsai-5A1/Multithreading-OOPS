package com.amazon.Multithreading;

public class Thread2 extends Thread {
    public Thread2(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for(int i = 0; i < 6; i++) {
            System.out.println("Inside " + Thread.currentThread().getName() + " " + i);
        }
    }
}
