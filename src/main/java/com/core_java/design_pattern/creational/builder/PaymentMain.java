package com.core_java.design_pattern.creational.builder;

public class PaymentMain {

    public static void main(String[] args) {

        Payment upi = new Payment.Builder().setId(1).setIsDone(true).build();

        Payment.Builder builder = new Payment.Builder();
        Payment paytm = builder.setId(2).setPaymentMode("paytm").setIsDone(true).build();
    }
}
