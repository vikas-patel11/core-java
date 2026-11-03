package com.core_java.java8.streamApi;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStream {

    public static void main(String[] args) {

        //filter

        List<Integer> list = Arrays.asList(4, 8, 3, 7, 6, 2, 9);
        List<Integer> list1 = Arrays.asList(14, 18, 13, 17, 16, 12, 19);
        List<String> list3 = Arrays.asList("vikas", "patel", "tekno");

     List<Integer> list2 = Stream.concat(list.stream(), list1.stream()).toList();
        System.out.println(list2);

       List<Integer> newList = new ArrayList<>(list);
        newList.addAll(list1);
        System.out.println(newList);

        List<Integer> list4 = Stream.of(list, list1)
                .flatMap(Collection::stream)
                .toList();
        System.out.println(list4);

        int[][] arr = {
                {1,2},
                {3,4},
                {5,6}
        };

        int[] array = Arrays.stream(arr).flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println(Arrays.toString(array));



    }
}
