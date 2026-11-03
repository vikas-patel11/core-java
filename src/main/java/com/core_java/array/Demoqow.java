package com.core_java.array;

import java.util.Arrays;

public class Demoqow {

    public static void main(String[] args) {

        Integer[] num  = {22, 12, 76, 18, 13, 11, 21, 31};

//        Arrays.stream(num).map(String::valueOf)
//                .filter(value -> value.e)

        Arrays.stream(num)
                .map(String::valueOf)
                .filter(n -> n.startsWith("1"))
                .forEach(System.out::println);

    }
}
