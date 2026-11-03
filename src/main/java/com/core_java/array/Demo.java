package com.core_java.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {

        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i]= (int) (Math.random()*10);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }

        int[] age = {10,25,23,24};
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        for (int eachAge:age){
            System.out.println(eachAge);
        }
        
        
        
        int [] nums = {5,8,2,4,6,7,2,5,4};

        Map<Integer,Integer> map = new HashMap<>();
        
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        System.out.println(map);

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {

            System.out.println(integerIntegerEntry.getKey() + " :: " +integerIntegerEntry.getValue());
        }


        String str= "vikaspatel";

        Map<Character , Integer> map1 = new HashMap<>();

        for (char c : str.toCharArray()){

            map1.put(c,map1.getOrDefault(c,0)+1);

        }

        System.out.println(map1);


    }
}
