package com.amazon.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main is starting its execution");
//        int a = 2;
//        int b = 0;
//        try {
//            int c = a / b;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Finally block");
//        }
        try {
            System.out.println("Started Try block");
            String word = "Hi";
            if (word.equals("Hi")) {
                throw new MyException("Word is equal to Hi");
            }
            System.out.println("Completed Try block");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {

        } finally {
            System.out.println("FINALLY Block");
        }
        System.out.println("Main is ending its execution");
    }
}
