package com.core_java.design_pattern.behavioural.strategy;

public class UPI implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("pay by upi :: "+amount);
    }
}
