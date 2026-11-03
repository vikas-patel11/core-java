package com.core_java.design_pattern.creational.factory;

public class WebDeveloper implements Employee{


    @Override
    public int getSalary() {

        System.out.println("Web developer salary::");
        return 60000;
    }


}
