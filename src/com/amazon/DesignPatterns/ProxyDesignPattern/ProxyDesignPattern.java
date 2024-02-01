package com.amazon.DesignPatterns.ProxyDesignPattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        try {
            EmployeeDao obj = new EmployeeDaoProxy();
            obj.create("ADMIN", new EmployeeData());
            obj.create("USER", new EmployeeData());
            System.out.println("Operation successfull");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
