package com.core_java.design_pattern.structural.proxy;

public class ATMProxy implements BankAccount{

    private RealBankAccount realBankAccount;

    private int pin;

    public ATMProxy(int pin) {
        this.pin = pin;
    }

    @Override
    public void withdraw(int amount) {

        // Access control
        if (pin != 1234) {
            System.out.println("Invalid PIN. Access Denied!");
            return;
        }

        // Lazy initialization
        if (realBankAccount == null) {
            realBankAccount = new RealBankAccount();
        }

        realBankAccount.withdraw(amount);
    }
}
