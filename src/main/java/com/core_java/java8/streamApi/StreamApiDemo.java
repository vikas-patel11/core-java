package com.core_java.java8.streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiDemo {
    public static void main(String[] args) {

//        List<Integer> list =new ArrayList<>();
        List<Integer> list = List.of(21, 56, 87, 89, 65, 26);
        List<Integer> list1 = Arrays.asList(56, 889, 35, 46, 42, 51, 63);

        List<Integer> list2 = new ArrayList<>();

        list.forEach(e -> {
            if (e % 2 == 0) {
                list2.add(e);
            }
        });

        System.out.println("list : " + list);
        System.out.println("even list : " + list2);

        List<Integer> collect = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println(list.stream().filter(e-> e>50).collect(Collectors.toList()));
        System.out.println(list.stream().filter(e-> e>50).toList());



       //Array

        long[] num = {12, 58, 96, 43, 62, 41};

        // Correct way to stream the elements and filter
        List<Long> filteredList = Arrays.stream(num)
                .filter(e -> e > 10)
                .boxed() // Convert primitive  to Non primitive
                .toList();

        System.out.println(filteredList);

        Set<Long> squareData = Arrays.stream(num)
                .map(e -> e*e)
                .boxed() // Convert primitive  to Non primitive
                .collect(Collectors.toSet());

        System.out.println(squareData);


    }
}
