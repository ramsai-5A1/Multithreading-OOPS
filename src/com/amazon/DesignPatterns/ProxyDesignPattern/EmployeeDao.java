package com.amazon.DesignPatterns.ProxyDesignPattern;

public interface EmployeeDao {
    public void create(String client, EmployeeData obj) throws Exception;
    public void delete(String client, int employeeId) throws Exception;
    public EmployeeData get(String client, int employeeId) throws Exception;
}
