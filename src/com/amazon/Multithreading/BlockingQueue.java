package com.amazon.Multithreading;


import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Integer> Q;
    private int capacity;

    public BlockingQueue(int capacity) {
        System.out.println("BlockingQueue object instantiated");
        Q = new LinkedList<>();
        this.capacity = capacity;
    }

    public boolean add(int value) {
        synchronized (Q) {
            while (isFull()) {
                try {
                    Q.wait();
                } catch(InterruptedException e) {

                }
            }
            Q.add(value);
            Q.notifyAll();
            return true;
        }
    }

    public int remove() {
        synchronized (Q) {
            while (isEmpty()) {
                try {
                    Q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            int value = Q.remove();
            Q.notifyAll();
            return value;
        }
    }

    private boolean isEmpty() {
        return Q.size() == 0;
    }

    private boolean isFull() {
        return Q.size() == capacity;
    }
}
