package com.core_java.java8.functional_Interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(20));






        // BiPredicate
        BiPredicate<Integer, Integer> isEven1 = (num1,num2)-> (num1+num2)%2==0;
        System.out.println(isEven1.test(2,4));





    }
}
