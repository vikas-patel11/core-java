package com.core_java.DSA.TwoPointer;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;



public class arrayDemo {

    public static void main(String[] args) {
        int[] nums = {1, 10, 2, 9, 3, 8};
        int target = 11;


//        Map<Integer, Integer> map = new LinkedHashMap<>();
        Set<Integer> set = new HashSet<>();

        int index = 0 ;

        for (int num : nums){
            int need = target-num;
            if(set.contains(need)){
                System.out.println(num + " + " + need + " = " + target);
            }
            set.add(num);
            index++;
        }


    }
}
