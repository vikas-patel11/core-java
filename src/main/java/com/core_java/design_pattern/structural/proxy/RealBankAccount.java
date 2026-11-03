package com.core_java.design_pattern.structural.proxy;

public class RealBankAccount implements BankAccount{

    private int balance = 1000;

    @Override
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
