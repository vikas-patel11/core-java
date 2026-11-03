package com.core_java.design_pattern.creational.abstract_factory.payment;

public class PaymentClient {

    public static void main(String[] args) {

        Payment upi = PaymentFactory.getPayment("UPI");
        System.out.println(upi.pay());


    }
}
