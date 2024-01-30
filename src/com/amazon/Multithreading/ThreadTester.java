package com.amazon.Multithreading;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main is Starting");

        Thread thread3 = new Thread(new Thread3(),"thread-3");
        thread3.start();

        Thread thread4 = new Thread(() -> {
            for(int i = 10; i <= 15; i++) {
                System.out.println("Thread " + Thread.currentThread().getName() + " " + i);
            }
        }, "thread-4");
        thread4.start();



        System.out.println("Main is Exiting");
    }
}
