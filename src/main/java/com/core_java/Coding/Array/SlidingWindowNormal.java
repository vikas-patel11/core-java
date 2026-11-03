package com.core_java.Coding.Array;

public class SlidingWindowNormal {
    public static void main(String[] args) {

        int[] num = {5,4,8,6,7};
//        int[] num = {1,3,2,5,6,8};
        int window = 3;
        int maxSum = 0;

        for (int i = 0; i < (num.length-window)+1; i++) {

            int count = 0;
            for (int j = i; j < window+i; j++) {
                count = count+num[j];
            }
            if(maxSum<count) {
                maxSum = count;
            }

        }

        System.out.println(maxSum);
    }
}
