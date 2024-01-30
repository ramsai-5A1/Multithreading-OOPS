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

        BlockingQueue queue = new BlockingQueue(4);
        new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                System.out.println(queue.add(i));
            }
        }, "Enqeue").start();

        new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                System.out.println(queue.remove());
            }
        }, "Dequeue").start();
        System.out.println("Main is Exiting");
    }
}
