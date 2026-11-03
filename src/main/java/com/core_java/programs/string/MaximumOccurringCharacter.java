package com.core_java.programs.string;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurringCharacter {
    public static void main(String[] args) {
        String word = "Java is great and Java is fun. Programming in Java is great.";
        Map<Character, Integer> map = new HashMap<>();
        for (String s : word.toLowerCase().split("\\W+")) {
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        char maxOccurringChar = ' ';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxOccurringChar = entry.getKey();
            }
        }

        System.out.println("Char: " + maxOccurringChar);
        System.out.println("Value: " + maxFrequency);


    }
}
