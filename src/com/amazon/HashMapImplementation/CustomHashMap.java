package com.amazon.HashMapImplementation;


import javax.swing.*;
import java.util.Arrays;

public class CustomHashMap<K, V> {
    private static int INITIAL_CAPACITY;
    private static int MAX_CAPACITY;
    private Box[] data;

    private class Box<K, V> {
        public K key;
        public V value;
        public Box next;

        public Box(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public CustomHashMap() {
        this.INITIAL_CAPACITY = 1 << 4;
        this.MAX_CAPACITY = 1 << 30;
        this.data = new Box[this.INITIAL_CAPACITY];
        for(int index = 0; index < this.INITIAL_CAPACITY; index++) {
            this.data[index] = null;
        }
    }

    private int findIndex(K key) {
       int index = Math.abs(key.hashCode()) % this.data.length;
       return index;
    }

    public void put(K key, V value) {
        Box currNode = new Box(key, value);
        int index = this.findIndex(key);

        Box startNode = data[index];
        if (startNode == null) {
            data[index] = currNode;
            return;
        }

        Box previousNode = startNode;
        while (startNode != null) {
            if (startNode.key == key) {
                startNode.value = value;
                return;
            }
            previousNode = startNode;
            startNode = startNode.next;
        }
        previousNode.next = currNode;
    }

    public boolean containsKey(K key) {
        int index = this.findIndex(key);
        Box curr = this.data[index];
        while (curr != null) {
            if (curr.key == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public V get(K key) {
        int index = this.findIndex(key);
        Box curr = this.data[index];
        while (curr != null) {
            if (curr.key == key) {
                return (V) curr.value;
            }
            curr = curr.next;
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "{";
        for(int index = 0; index < this.data.length; index++) {
            Box curr = data[index];
            while (curr != null) {
                String presentOne = "(";
                presentOne += String.valueOf(curr.key);
                presentOne += "=";
                presentOne += String.valueOf(curr.value);
                presentOne += ")";
                result += presentOne;
                curr = curr.next;
            }
        }
        result += "}";
        return result;
        //return Arrays.toString(this.data);
    }
}
