package com.core_java.oops.abstraction;

public class ImpDemo implements InterfaceDemo{


    public static void main(String[] args) {

    }

    @Override
    public void demo() {

    }

    @Override
    public void demo1() {
        InterfaceDemo.super.demo1();
    }


}
