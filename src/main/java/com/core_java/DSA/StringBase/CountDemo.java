package com.core_java.DSA.StringBase;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CountDemo {
    public static void main(String[] args) {

        String s = "aabbxcccz";

//        s.chars()
//                .mapOfObj(c->(char)c)
//                .collect(Collectors.groupingBy(x->x,Collectors.count()))
//                .entrySet()
//                .stream()
//                .forEach(System.out::print);

        Character c1 = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(z -> z.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
        System.out.println(c1);

        Character c2 = s.chars()
                .mapToObj(c -> (char) c)
                .filter(e -> s.indexOf(e) == s.lastIndexOf(e))
                .findFirst().orElse(null);
        System.out.println(c2);

        String s22 = "java is easy";
        String[] word = s22.split(" ");
        System.out.println(word.length);

        StringBuilder sb2 = new StringBuilder();
//        System.out.println(sb2.reverse());

        for (int i = word.length-1; i>=0; i--) {
            sb2.append(word[i]+" ");
        }
        System.out.println(sb2);
    }

}
