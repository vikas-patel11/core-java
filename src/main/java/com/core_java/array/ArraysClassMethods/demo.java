package com.core_java.array.ArraysClassMethods;

import com.core_java.array.Array;

import java.util.Arrays;
import java.util.Comparator;

public class demo {

    public static void main(String[] args) {

        int[] num = {5,6,8,25,46,89};

        int[] [] diNum = {{56,87,46,25},{56,2,7,89}};

//        System.out.println(Arrays.toString(num)); // convert array to string (1D)
//        System.out.println(Arrays.deepToString(diNum)); // convert array to string (2D)
//        System.out.println(Arrays.binarySearch(num,25)); //find and return index
//
//
//        System.out.println(Arrays.toString(num));

        int[] arr = {10,20,30};

        System.out.println(Arrays.toString(arr));



        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
