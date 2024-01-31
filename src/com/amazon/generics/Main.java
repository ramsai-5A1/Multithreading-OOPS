package com.amazon.generics;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student obj1 = new Student(1, 123);
        Student obj2 = new Student(2, 240);
        Student obj3 = new Student(3, 140);
        Student obj4 = new Student(4, 40);
        Student obj5 = new Student(5, 340);
        Student[] list = {obj1, obj2, obj3, obj4, obj5};
        System.out.println(Arrays.toString(list));

        //Arrays.sort(list);
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.marks - o2.marks;
            }
        });
        System.out.println(Arrays.toString(list));
    }
}
