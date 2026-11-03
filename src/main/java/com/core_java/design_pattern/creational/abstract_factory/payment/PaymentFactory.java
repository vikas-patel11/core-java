package com.core_java.design_pattern.creational.abstract_factory.payment;

public class PaymentFactory {

    public static Payment getPayment(String type){

        if(type.equals("UPI")){
            return new Upi();
        }else if(type.equals("WALLET")){
            return new Wallet();
        }

        return null;
    }
}
