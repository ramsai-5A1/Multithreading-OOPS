package com.amazon.Multithreading;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main is Starting");

        Thread1 thread1 = new Thread1("thread-1");
        thread1.start();

        Thread2 thread2 = new Thread2("thread-2");
        thread2.start();

        Thread thread3 = new Thread(new Thread3(),"thread-3");
        thread3.start();

        Thread thread4 = new Thread(new Thread4(), "thread-4");
        thread4.start();

        System.out.println("Main is Exiting");
    }
}
