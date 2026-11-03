package com.core_java.design_pattern.creational.factory;

public class DeveloperClient {
    public static void main(String[] args) {

        Employee web = EmployeeFactory.getEmployee("web");
        System.out.println(web.getSalary());
    }
}
