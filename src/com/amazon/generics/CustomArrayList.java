package com.amazon.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE;
    private int size;

    public CustomArrayList() {
        this.DEFAULT_SIZE = 10;
        this.size = 0;
        this.data = new Object[this.DEFAULT_SIZE];
        for(int i = 0; i < data.length; i++) {
            data[i] = null;
        }
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[2 * data.length];
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public void add(T ele) {
        if (isFull()) {
            resize();
        }
        data[size++] = ele;
    }

    public T remove() {
        if (size > 0) {
            T result = (T) data[--size];
            data[size] = null;
            return result;
        }
        return null;
    }

    @Override
    public String toString() {
        return "ArrayList is: " + Arrays.toString(data) + " size: " + this.size;
    }
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        list.remove();
        System.out.println(list);

        CustomArrayList<String> list2 = new CustomArrayList<>();
        list2.add("Ram");
        list2.add("Kiran");
        list2.add("manju");

        System.out.println(list2);
        list2.remove();
        System.out.println(list2);


    }
}
