package com.amazon.Multithreading;

public class Stack {
    private int[] array;
    private int stackTop;
    Object lock1, lock2;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        lock1 = new Object();
        lock2 = new Object();
    }

    public synchronized boolean push(int ele) {
        //synchronized (lock1) {
            if (isFull()) return false;
            ++stackTop;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            array[stackTop] = ele;
            return true;
       // }
    }

    public int peek() {
        synchronized (lock1) {
            if (isEmpty())  return -1;
            try {
                Thread.sleep(1000);
            } catch(Exception e) {

            }
            return array[stackTop];
        }

    }

    public synchronized int pop() {
        //synchronized (lock1) {
            if (isEmpty())  return -1;
            int value = array[stackTop--];
            try {
                Thread.sleep(1000);
            } catch(Exception e) {

            }
            if (!isEmpty())
                array[stackTop] = -1;
            return value;
        //}
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop + 1 == array.length;
    }
}
