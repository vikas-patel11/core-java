package com.core_java.programs.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String name ="programming";

        Map<String ,Integer> ms =new LinkedHashMap<>();
        for (String s : name.split("")) {
            ms.put(s,ms.getOrDefault(s,0)+1);
        }
        for (Map.Entry<String, Integer> entry : ms.entrySet()) {
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }


//        char[] charArray= name.toLowerCase().toCharArray();
//
//        Map<Character,Integer> map = new HashMap<>();
//        for(char c: charArray){
//            map.put(c, map.getOrDefault(c,0)+1);
//        }
//
//        Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
//        for (Map.Entry<Character, Integer> entry :entrySet){
//            int value = (int) entry.getValue();
//            if(value>1){
//                System.out.println(entry.getKey()+" : "+entry.getValue());
//
//            }
//        }


    }
}
