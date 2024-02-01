package com.amazon.DesignPatterns.ProxyDesignPattern;

public class EmployeeImpl implements EmployeeDao {

    @Override
    public void create(String client, EmployeeData obj) throws Exception {
        System.out.println("Created employ obj");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted employee record");
    }

    @Override
    public EmployeeData get(String client, int employeeId) throws Exception {
        System.out.println("Fetching from DB");
        return new EmployeeData();
    }
}
