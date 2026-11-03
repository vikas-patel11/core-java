package com.core_java.design_pattern.creational.abstract_factory;

public class AndroidDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public String getName() {

        return "Android";
    }
}
