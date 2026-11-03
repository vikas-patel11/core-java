package com.core_java.java8.streamApi.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayBase {
    public static void main(String[] args) {
        int[] arr = {10, 51 ,20, 30, 41};


       // 1. Find sum of all elements

        /*int sum = 0;
        for (int num : arr){
            sum = sum+num;
        }
        System.out.println(sum);

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);*/

        // 2. Find average
       /* double sum=0.0;
        for (int num : arr){
            sum=sum+num;
        }
        double avg = sum / (arr.length);
        System.out.println(avg);

        double v = Arrays.stream(arr).average().orElse(0.0);
//        double asDouble = Arrays.stream(arr).average().getAsDouble();
        System.out.println(v);*/

        // 3. Find maximum element
        // 4. Find minimum element

        /*int max= 0;
        for (int num : arr){

            if(num>max){
                max= num;
            }
        }
        System.out.println(max);


        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        int i = Arrays.stream(arr).max().orElse(0);
        int asInt = Arrays.stream(arr).max().getAsInt();
        System.out.println(asInt);
        */

        // 5. Count even numbers

      /*  int count = 0;
        for (int num : arr){

            if(num%2==0){
               count++;
            }
        }
        System.out.println(count);


        long count1 = Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .count();
        System.out.println(count1);*/

        //sort in descending order

        int[] nums = {4,9,3,7,6,1,25,55};
        Arrays.stream(nums)
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1)
                .limit(2)
//                .findFirst().orElseThrow();
                .forEach(System.out::println);

//        System.out.println(i);



    }
}
