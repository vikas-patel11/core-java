package com.core_java.design_pattern.creational.factory.payment;

public class Wallet implements Payment{
    @Override
    public String pay() {
        return "BY WALLET";
    }
}
