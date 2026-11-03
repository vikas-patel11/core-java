package com.core_java.design_pattern.creational.abstract_factory;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 60000;
    }

    @Override
    public String getName() {
        return "Web";
    }
}
