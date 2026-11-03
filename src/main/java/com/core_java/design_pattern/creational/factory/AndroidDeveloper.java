package com.core_java.design_pattern.creational.factory;

public class AndroidDeveloper implements Employee{

    @Override
    public int getSalary() {
        System.out.println("Android developer salary ::");
        return 50000;
    }
}
