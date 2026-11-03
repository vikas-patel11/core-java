package com.core_java.java8.functional_Interface;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Function1 {

    public static void main(String[] args) {


        Function <String, Integer> function1 = str -> str.length();
        Integer vikas = function1.apply("vikas");
        System.out.println(vikas);

        Function<Integer, String> function2 = num -> String.valueOf(num);
//        Integer vikasd = function2.apply("vikasd");
//        System.out.println(vikasd);

        String vhbhcb = function1.andThen(function2).apply("vhbhcb  c");
        System.out.println(vhbhcb);



        UnaryOperator<String> unaryOperator = str -> str.toUpperCase();
        System.out.println(unaryOperator.apply("cvvvvvvv"));
        Function<Object, Object> identity = Function.identity();

        BinaryOperator<String> binaryOperator = (a,b)->a.toUpperCase()+b;
        String apply = binaryOperator.apply("vikas", "patel");
        System.out.println(apply);

    }
}
