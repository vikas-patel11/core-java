package com.core_java.oops.Polymorphism;

public class Demo {

    public void show(int... a){
        System.out.println("hello!");
    }
    public void show(int a){
        System.out.println("hello! A");
    }
    public void show(int a, int b){
        System.out.println("hello! B");
    }

    public static void main(String[] args) {
        Demo d =new Demo();
        d.show(1,55,222,'c');
        d.show('c');
        d.show('c',22);
    }
}
