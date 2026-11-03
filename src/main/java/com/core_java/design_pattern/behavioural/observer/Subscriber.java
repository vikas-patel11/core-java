package com.core_java.design_pattern.behavioural.observer;

public class Subscriber implements Observer {

    @Override
    public void notified() {
        System.out.println("New video uploaded!!");

    }
}
