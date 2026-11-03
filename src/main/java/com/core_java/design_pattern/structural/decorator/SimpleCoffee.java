package com.core_java.design_pattern.structural.decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
