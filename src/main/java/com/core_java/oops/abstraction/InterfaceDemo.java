package com.core_java.oops.abstraction;

public interface InterfaceDemo {

    void demo();

    default void demo1(){
        System.out.println("dafault");
    }



    private void demo2(){
        System.out.println("private");

    }

    static void demo3(){
        System.out.println("static");
    }


}
