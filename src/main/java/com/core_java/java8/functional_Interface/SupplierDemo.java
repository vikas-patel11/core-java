package com.core_java.java8.functional_Interface;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<Integer> supplier = ()-> 5*5;

        System.out.println(supplier.get());



    }



}
