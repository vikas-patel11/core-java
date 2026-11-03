package com.core_java.programs.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWords {
    public static void main(String[] args) {
        String word = "Java is great and Java is powerful";

//        String lowerCase = word.toLowerCase();
//        Map<String, Integer> map = new HashMap<>();
//        for (String s : lowerCase.split(" ")) {
//            map.put(s, map.getOrDefault(s, 0) + 1);
//        } for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            int value = entry.getValue();
//            if (value>1) {
//                System.out.println(entry.getKey()+" : "+ entry.getValue());
//
//            }
//        }


        // duplicate Character

        String lower = word.toLowerCase();
        String[] split= lower.split(" ");
        Map<Character,Integer> map =new LinkedHashMap<>();
        for (String sw : split){
            char[] charsArray = sw.toCharArray();
            for (char c : charsArray){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }

        Set<Map.Entry<Character,Integer>> entries = map.entrySet();
        for (Map.Entry<Character,Integer> entry : entries){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }

    }
}
