package com.core_java.design_pattern.structural.decorator;

public class MilkDecorator implements Coffee{

    private Coffee coffee;


    public MilkDecorator(Coffee c) {
        this.coffee = c;
    }

    @Override
    public int getPrice() {
        return coffee.getPrice()+20;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Milk";
    }
}
