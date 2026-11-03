package com.core_java.java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {

        int[] num = {5,9,45,62,15,32,45,78,1,3};

        // filter
        // map
        // reduce

        IntStream stream = Arrays.stream(num);
        int[] array = stream.filter(x -> x % 2 == 0).toArray();
        System.out.println(Arrays.toString(array));

        String[] names = {"vikas","patel","ram","ramesh"};

        for(String name : names){
            System.out.println(name.substring(0,1).toUpperCase()+name.substring(1));
        }

        //stream api
        Arrays.stream(names)
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .forEach(System.out::println);


       // infinite stream

        Stream.generate(()->"vikas")
                .limit(5)
                .forEach(System.out::print);

        Stream.iterate(2,x->x)
                .limit(10)
                .forEach(System.out::println);




    }
}
