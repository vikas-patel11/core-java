package com.core_java.java8.functional_Interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer1 {

    public static void main(String[] args) {
        Consumer<String> consumer1 = str-> System.out.println("UpperCase : "+str.toUpperCase());
        consumer1.accept("vikas");


        Consumer<String> consumer2 = str-> System.out.println("Length : "+str.length());
        consumer1.andThen(consumer2).accept("tekno");

        // bifunctional

        BiConsumer<String,Integer> biConsumer  = (str,num)-> System.out.println("Str : "+str.toUpperCase() + "  "+ "num : "+ num*num);

        biConsumer.accept("tekno-point",510);
    }
}
