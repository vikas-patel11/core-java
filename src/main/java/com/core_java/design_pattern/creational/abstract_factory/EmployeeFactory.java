package com.core_java.design_pattern.creational.abstract_factory;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory){

        return factory.createEmployee();
    }

}
