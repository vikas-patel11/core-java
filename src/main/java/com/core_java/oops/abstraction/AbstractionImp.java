package com.core_java.oops.abstraction;

public class AbstractionImp extends AbstractionDemo{
    @Override
    public void show1() {
        System.out.println("sshow1");
    }

    @Override
    public void show() {
        System.out.println("showImp");
    }


    public static void main(String[] args) {
        AbstractionImp abstractionImp = new AbstractionImp();
        abstractionImp.show1();
    }
}
