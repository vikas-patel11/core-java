package com.core_java.design_pattern.behavioural.strategy;

public class Main {

    public static void main(String[] args) {

//        ChoosePaymentMode choosePaymentMode = new ChoosePaymentMode(new UPI());
//        choosePaymentMode.doPayment(120);

        ChoosePaymentMode choosePaymentMode = new ChoosePaymentMode(new Card());
        choosePaymentMode.doPayment(150);

    }
}
