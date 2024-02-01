package com.amazon.HashMapImplementation;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<Integer, String> store = new CustomHashMap();
        store.put(1, "arjun");
        store.put(2, "krishna");
        store.put(2, "radha");
        store.put(2, "venu");
        store.put(3, "Sai");
        System.out.println(store);

        CustomHashMap<String, Integer> store2 = new CustomHashMap<>();
        store2.put("arjun", 1);
        store2.put("krishna", 2);
        store2.put("sai", 3);
        System.out.println(store2);
        System.out.println(store2.containsKey("sai1"));
        System.out.println(store2.get("sai"));
        System.out.println(store.get(3));

    }
}
