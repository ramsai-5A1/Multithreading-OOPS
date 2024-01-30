package com.amazon.Multithreading;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main is Starting");

//        Thread thread3 = new Thread(new Thread3(),"thread-3");
//        thread3.start();

//        Thread thread4 = new Thread(() -> {
//            for(int i = 10; i <= 15; i++) {
//                System.out.println("Thread " + Thread.currentThread().getName() + " " + i);
//            }
//        }, "thread-4");
//        thread4.start();

//        Stack stack = new Stack(3);
//
//        new Thread(() -> {
//            for(int i = 0; i < 10; i++) {
//                System.out.println(Thread.currentThread().getName() + " " + stack.push(i));
//            }
//        }, "Pusher").start();
//
//        new Thread(() -> {
//            for(int i = 0; i < 10; i++) {
//                System.out.println(Thread.currentThread().getName() + " " + stack.pop());
//            }
//        }, "Popper").start();

//        BlockingQueue queue = new BlockingQueue(4);
//        new Thread(() -> {
//            for(int i = 0; i < 10; i++) {
//                System.out.println(queue.add(i));
//            }
//        }, "Enqeue").start();
//
//        new Thread(() -> {
//            for(int i = 0; i < 10; i++) {
//                System.out.println(queue.remove());
//            }
//        }, "Dequeue").start();

//        Thread thread4 = new Thread(() -> {
//            try {
//                Thread.sleep(1);
//                for(int i = 0; i < 1000; i++);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }, "States");
//        thread4.start();
//
//        while(true) {
//            Thread.State state = thread4.getState();
//            System.out.println(state);
//            if (state == Thread.State.TERMINATED)   break;
//        }
        String lock1 = "lock1";
        String lock2 = "lock2";

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("[out] lock acquired for " + Thread.currentThread().getName());
                synchronized (lock2) {
                    System.out.println("[in] Lock acquired for " + Thread.currentThread().getName());
                }
            }
        }, "thread-1");

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("[out] lock acquired for " + Thread.currentThread().getName());
                synchronized (lock1) {
                    System.out.println("[in] Lock acquired for " + Thread.currentThread().getName());
                }
            }
        }, "thead-2");

        thread1.start();
        thread2.start();
        System.out.println("Main is Exiting");
    }
}
