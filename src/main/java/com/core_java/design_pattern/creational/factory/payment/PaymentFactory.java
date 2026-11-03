package com.core_java.design_pattern.creational.factory.payment;

public class PaymentFactory {

    public static Payment getPaymentMode(String paymentType){

        if(paymentType.equals("UPI")){
            return new Upi();
        }else if(paymentType.equals("WALLET")){
            return new Wallet();
        }

        return null;

    }
}
