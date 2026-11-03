package com.core_java.leetCode.string;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class ISSameChar {
    public static void main(String[] args) {
        String word ="abacbc";
        String[] ap = word.split("");
        Map<String,Integer> map =new LinkedHashMap<>();
        for(String s : ap){
            map.put(s,map.getOrDefault(s,0)+1);
        }

//        int flag = 0;
//        for (int count : map.values()){
//            if(flag==0){
//               flag = count;
//            }else if (count!=flag){
//                System.out.println("false");
//                break;
//            }
//        }

        int count = map.get(ap[0]);
        for (int charCount : map.values()){
            if(charCount!=count){
                System.out.println("false");
                break;
            }
        }


        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        System.out.println("true");



//        int firstCount = map.values().iterator().next();
//
//        for(Map.Entry<String,Integer> entry: map.entrySet()){
//            if(firstCount!=entry.getValue()){
//                System.out.println("false");
//                break;
//            }
//
//        }
//
//        System.out.println("true");
    }
}
