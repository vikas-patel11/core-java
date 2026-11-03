package com.core_java.design_pattern.structural.proxy;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new ATMProxy(1234);
        bankAccount.withdraw(50);
    }
}
