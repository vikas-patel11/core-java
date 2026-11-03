package com.core_java.programs.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfEachCharacter {
    public static void main(String[] args) {
        String sentence = "Java is great. Java is fun. Java is powerful.";

        Map<Character,Integer> map =new HashMap<>();
        for (String s : sentence.toLowerCase().split("\\W+")) {
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c,0)+1);
            }
        }
        map.forEach((key,value)->{
            System.out.println(key +":" +value);
        });

    }
}
