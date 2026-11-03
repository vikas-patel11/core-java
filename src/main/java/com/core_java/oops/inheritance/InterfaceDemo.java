package com.core_java.oops.inheritance;

public interface InterfaceDemo {
    int a =10;
    String demo ();

    default String show(){
        System.out.println("default");
        return null;
    }

    static int print(){
        System.out.println("static");
        return 0;
    }

    private String display(){
        System.out.println("private");
        return null;
    }
}
