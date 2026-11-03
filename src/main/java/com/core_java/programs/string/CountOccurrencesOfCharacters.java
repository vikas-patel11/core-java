package com.core_java.programs.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfCharacters {
    public static void main(String[] args) {
        String word = "anand";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
