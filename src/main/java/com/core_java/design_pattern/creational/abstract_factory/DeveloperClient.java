package com.core_java.design_pattern.creational.abstract_factory;

public class DeveloperClient {
    public static void main(String[] args) {

        Employee android = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        System.out.println(android.getSalary());
        System.out.println(android.getName());
    }
}
