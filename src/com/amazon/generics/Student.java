package com.amazon.generics;

public class Student  {
    int rollNo;
    int marks;

    Student(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.marks - o.marks;
//    }

    @Override
    public String toString() {
        return "[" + this.marks + ", " + this.rollNo + "]";
    }
}
