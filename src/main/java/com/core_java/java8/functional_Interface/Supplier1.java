package com.core_java.java8.functional_Interface;

import java.util.function.Supplier;

public class Supplier1 {

    public static void main(String[] args) {

        Supplier<String> supplier = ()-> "vikas "+"Patel";
        String s = supplier.get();
        System.out.println(s);
    }
}
