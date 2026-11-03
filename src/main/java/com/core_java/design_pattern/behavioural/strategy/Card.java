package com.core_java.design_pattern.behavioural.strategy;

public class Card implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("pay by Card:: "+amount);
    }
}
