package com.core_java.design_pattern.behavioural.strategy;

public class ChoosePaymentMode {
    private PaymentStrategy paymentStrategy;


    public ChoosePaymentMode(PaymentStrategy ps) {
        this.paymentStrategy = ps;
    }


    public void doPayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
