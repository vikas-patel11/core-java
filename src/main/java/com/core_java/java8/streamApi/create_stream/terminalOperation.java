package com.core_java.java8.streamApi.create_stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class terminalOperation {

    public static <chars> void main(String[] args) {

        int [] num = {4,8,2,6,9,3};
        double v = Arrays.stream(num).average().orElse(0.0);
//                .count();
//        .reduce(0,);


        String name = "cbhvchvdgcdgvcgd";
        IntStream chars = name.chars();
//        Stream<Integer> integerStream = chars.mapToObj(c -> c);
        Stream<Character> characterStream = chars.mapToObj(c -> (char) c);
        Character c1 = characterStream.filter(c -> name.indexOf(c) == name.lastIndexOf(c))
                .findFirst().orElse(null);
        System.out.println(c1);


        System.out.println(v);

    }
}
