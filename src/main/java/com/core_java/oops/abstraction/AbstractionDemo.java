package com.core_java.oops.abstraction;

abstract public class AbstractionDemo {


    public void show(){
        System.out.println("hello");
    }

    abstract public void show1();


    public static void main(String[] args) {
        AbstractionDemo ad = new AbstractionDemo() {
            @Override
            public void show1() {
                System.out.println("ncdjbd");
            }
        } ;
        ad.show1();
    }
}
