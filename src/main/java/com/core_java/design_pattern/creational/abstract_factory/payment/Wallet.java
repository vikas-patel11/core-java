package com.core_java.design_pattern.creational.abstract_factory.payment;

public class Wallet implements Payment{
    @Override
    public String pay() {
        return "Wallet";
    }
}
