package com.core_java.array.searching;

import java.util.Arrays;

public class BinaryDemo {

    public static void main(String[] args) {
//        int[] num = {5,9,2,7,5,6,4,3};
        int[] num = {2, 3, 4, 5, 5, 6, 7, 9};
        int target = 7;

        /*Arrays.sort(num);
        System.out.println(Arrays.toString(num));*/

        int start = 0;
        int end = num.length-1;

        boolean isFound= false;

        while (start<=end){
            int mid= (start+end)/2;

            if(num[mid]==target){
                isFound = true;
                System.out.println("value index is :: "+mid);
                break;
            }else if(num[mid]<target){
                start = mid+1;
            }else {
                end =mid-1;
            }
        }

        if (!isFound){
            System.out.println("value is not found :: " +target);

        }






    }
}
