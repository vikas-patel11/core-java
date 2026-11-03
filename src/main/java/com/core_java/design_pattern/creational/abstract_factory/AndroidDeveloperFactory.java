package com.core_java.design_pattern.creational.abstract_factory;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
