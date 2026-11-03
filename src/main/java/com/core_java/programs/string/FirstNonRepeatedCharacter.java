package com.core_java.programs.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {

//        String name="dummy";
//
//        Map<Character,Integer> map =new HashMap<>();
//        for (char c : name.toLowerCase().toCharArray()) {
//            map.put(c,map.getOrDefault(c,0)+1);
//        }
//
//        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
//            System.out.println(characterIntegerEntry);
//            if (characterIntegerEntry.getValue()>1){
//                System.out.println(characterIntegerEntry.getKey()+" : "+characterIntegerEntry.getValue());
//               // break;
//            }
//        }


        String word = "Satyas";
        String lowerCase = word.toLowerCase();
        char[] charArray = lowerCase.toCharArray();
        Map<Character,Integer> charCountMap = new HashMap<>();
        for(char c : charArray){
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }
        Set<Map.Entry<Character,Integer>> entries = charCountMap.entrySet();
        for(Map.Entry<Character,Integer> entry : entries){
            if(entry.getValue()==1){
                System.out.println(entry.getKey() + " : "+entry.getValue());
                break;
            }
        }






    }
}
