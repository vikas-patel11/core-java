package com.core_java.design_pattern.creational.factory.payment;

public class PaymentClient {

    public static void main(String[] args) {

        Payment upi = PaymentFactory.getPaymentMode("UPI");
        System.out.println(upi.pay());

        Payment wallet = PaymentFactory.getPaymentMode("WALLET");
        System.out.println(wallet.pay());


//        Upi upi = new Upi();
//        System.out.println(upi.pay());
//
//        Wallet wallet = new Wallet();
//        System.out.println(wallet.pay());
    }
}
