package com.amazon.DesignPatterns.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao {

    private EmployeeImpl employeeDaoObj;

    public EmployeeDaoProxy() {
        this.employeeDaoObj = new EmployeeImpl();
    }

    @Override
    public void create(String client, EmployeeData employeeData) throws Exception {
        if (client.equals("ADMIN")) {
            this.employeeDaoObj.create(client, employeeData);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN")) {
            this.employeeDaoObj.delete(client, employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeData get(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return this.employeeDaoObj.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }
}
