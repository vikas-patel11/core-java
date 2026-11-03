package com.core_java.array.ArraysClassMethods;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AllMethods {

    public static void main(String[] args) {

        int[] arr = {12,3,65,32,42};

       /* for (int a: arr){
            System.out.print(a+" ");
        }*/
        System.out.println("---------------------------");
        // toString();
       /* System.out.println(Arrays.toString(arr));*/

        // sort
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        // partial sort
       /* Arrays.sort(arr,1,4);
        System.out.println(Arrays.toString(arr));*/

        // binary search

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 42);
        System.out.println(index);

        // equals(single dimension) and deepEquals(multi dimension)
        //Compares two arrays element by element.

        /*int[] a = {1,2,3,4};
        int[] b = {1,2,3};

        System.out.println(Arrays.equals(a,b));*/

        int[][] a = {{1,2},{3,5,4}};
        int[][] b = {{1,2},{3,4}};

        System.out.println(Arrays.deepEquals(a,b));

        //copyOf()
        //Creates new copied array.

        int[] arr1 = {1,2,3};

        int[] copy = Arrays.copyOf(arr1,5);

        System.out.println(Arrays.toString(copy));

        // stream()
        //Converts array into Stream API.

        int[] arr2 = {1,2,3,4};

        Arrays.stream(arr2)
                .forEach(System.out::print);
    }
}
