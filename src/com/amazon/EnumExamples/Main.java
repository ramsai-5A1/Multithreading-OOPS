package com.amazon.EnumExamples;

public class Main {
    public static void main(String[] args) {
        Weekdays.Days day = Weekdays.Days.Monday;
        for(Weekdays.Days currentDay: Weekdays.Days.values()) {
            System.out.println(currentDay);
        }
    }
}
