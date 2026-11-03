package com.core_java.java8.streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 78, 36, 456, 25, 896, 34, 45,45,25,34);
        List<Integer> lists = Arrays.asList(45,86,25);

        boolean b = list.stream()
                .allMatch(x -> x == 896);
        System.out.println("anyMAth : "+b);

        //1. filter

       /* List<Integer> evenList = list.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        System.out.println(evenList);*/

        Map<Boolean, List<Integer>> partitioned  = list.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println("Even: "+partitioned.get(true));
        System.out.println("Odd : "+partitioned.get(false));


        Map<String, List<Integer>> grouped = list.stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "Even" : "Odd"));

        System.out.println("Even numbers: " + grouped.get("Even"));
        System.out.println("Odd numbers: " + grouped.get("Odd"));

// filter
        List<Integer> list1 = list.stream()
                .map(x -> (x * x) * 10)
                .toList();
        System.out.println("Map : " +list1);

        // sorted

        List<Integer> list2 = list.stream()
                .sorted().limit(5).toList();
        System.out.println("sorted : "+list2);

        List<Integer> list21 = list.stream()
                .sorted(Comparator.reverseOrder()).skip(3).toList();
        System.out.println("rev sorted : "+list21);

        // distinct
        List<Integer> list3 = list.stream()
                .sorted().distinct().toList();
        System.out.println("distinct sorted : "+list3);


        long count = list.stream()
                .count();
        System.out.println("count : " + count);

        Integer i = lists.stream()
                .findAny()
                .orElse(2);
        System.out.println(i);
    }



}
