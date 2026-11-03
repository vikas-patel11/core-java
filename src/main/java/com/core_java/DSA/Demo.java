package com.core_java.DSA;

import java.util.*;

public class Demo {

        public static void main(String[] args) {

//            int[] arr = {10,20,5,99,50};
           /* int [] newArr = new int [arr.length];

            for(int i = arr.length-1 ; i>=0; i--){
                newArr[arr.length-1-i] = arr[i];
            }

            for(int value : newArr){
                System.out.print(value + " ");
            }
*/

            int[] arr = {10,20,5,99,50};
            int left = 0;
            int right = arr.length-1;

            while (left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right --;

            }

            System.out.println(Arrays.toString(arr));

//            int[] arr = {1,2,3,2,4,5,1};

            /*Map<Integer , Integer> map = new HashMap();

            for(int value : arr){
                 map.put(value, map.getOrDefault(value,0) + 1);
            }

            for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {

                if(integerIntegerEntry.getValue()>1) {
                    System.out.println(integerIntegerEntry);
                }
            }*/

            Set<Integer> set = new HashSet<>();

            for (int value : arr){
                if(!set.add(value)){
                    System.out.println(value);

                }
            }

        }

}
