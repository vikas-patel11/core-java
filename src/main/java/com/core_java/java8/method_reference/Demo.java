package com.core_java.java8.method_reference;

import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {

        Consumer<String>consumer = str-> System.out.println(str.length());
        consumer.accept("vikassssss");

        Consumer<String>consumer1 = System.out::println;
        consumer1.accept("vikassssss");

    }
}
