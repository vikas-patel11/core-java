package com.core_java.DSA.TwoPointer;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findDuplicate {

    public static void main(String[] args) {

        // remove duplicate
        int[] nums = {1,2,2,3,3,3,4,4};

       /* Set<Integer> set = new HashSet<>();

        for (int num : nums){
            set.add(num);
        }

        for (int e : set){
            System.out.println(e);
        }*/

        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue()>1) {
                System.out.println(m);
            }
        }

        System.out.println("----------------------------------------------");

         Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()
                )).entrySet().stream().filter(x -> x.getValue() > 1)
                .forEach(System.out::println);


    }
}
