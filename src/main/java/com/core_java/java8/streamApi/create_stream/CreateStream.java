package com.core_java.java8.streamApi.create_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        // 1. From Collection

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(201);
        list.add(260);
        list.add(120);

        Stream<Integer> stream = list.stream();


        // map
        Map<String , Integer> map = new HashMap<>();

        map.put("tekno",20);
        map.put("point",205);

        Stream<Map.Entry<String, Integer>> stream1 = map.entrySet().stream();


        // by list

        List<Integer> list1 = List.of(2, 9, 6, 4, 9,4,65,66);
        Stream<Integer> stream2 = list1.stream();

        List<Integer> collect = list1.stream().distinct().filter(x -> x % 2 == 0).map(x-> x+10).limit(4).skip(1).sorted().collect(Collectors.toList());
        System.out.println("demo::"+collect);

        Map<Boolean, List<Integer>> collect1 = list1.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(collect1.get(false));
        System.out.println(collect1.get(true));

        Map<Boolean, List<Integer>> collect2 = list1.stream().collect(Collectors.groupingBy(x -> x < 20 ));

        Map<Integer, List<Integer>> result =
                list1.stream().collect(Collectors.groupingBy(x -> x % 3));
//        list1.stream().forEach(System.out::print);

        System.out.println(Stream.iterate(1,x->x+1).limit(50).collect(Collectors.toList()));

        System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(50).collect(Collectors.toList()));

        Optional<Integer> max = list1.stream().max(Integer::compare);
        System.out.println(max.get());

        System.out.println(list1.stream().max(Integer::compare));
        System.out.println(list1.stream().min(Integer::compareTo));

        System.out.println(list1.stream().anyMatch(x->x>70));






        System.out.println(list1.stream().count());
        list1.stream().forEach(x->System.out.println(x));
        list1.stream().forEachOrdered(x->System.out.println(x));


        int age = 2;

        boolean b1 = Stream.of(age).anyMatch(x->x >= 18);
        System.out.println(b1);


        // Array

        int[] arr = {1, 2, 3};
        Arrays.stream(arr);


        // by Stream.of()

        Stream<Integer> istream = Stream.of(5,4);
        boolean b = istream.anyMatch(n -> n % 2 == 0);
        System.out.println(b);
//        List<Integer> collect = istream.filter(n -> n % 2 == 0).collect(Collectors.toList());

    }
}
