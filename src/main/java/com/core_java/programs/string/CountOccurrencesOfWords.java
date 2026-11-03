package com.core_java.programs.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfWords {
    public static void main(String[] args) {
        String word = "Java is great and Java is.!! powerful";
        Map<String,Integer> map =new HashMap<>();
        for (String w : word.toLowerCase().split("\\W+")) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }
}
