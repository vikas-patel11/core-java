package com.core_java.java8.functional_Interface;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<Integer,Integer> sum = (num)-> num+45;
        System.out.println(sum.apply(51));

        Function<Integer,Integer> sum1 = (num)-> num+45;
        Function<Integer,Integer> multi = (num)-> num*2;

        System.out.println(sum1.andThen(multi).apply(5));  // left --> right

        System.out.println(sum1.compose(multi).apply(5));  // right --> left

        //BiFunction
        BiFunction<Integer,String,String> biFunction = (age,name)-> "my name is "+name+" & age "+age;
        System.out.println(biFunction.apply(27,"vikas"));


    }
}
