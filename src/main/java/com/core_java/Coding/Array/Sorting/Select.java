package com.core_java.Coding.Array.Sorting;


import java.util.Arrays;

public class Select {
    public static void main(String[] args) {

        int[] num = {10, 5, 3, 9, 7, 4, 25, 11};


        for (int i = 0; i < num.length-1; i++) {
            int maxIndex = 0;
            for (int j = 0; j < num.length-1-i ; j++) {
                if (num[maxIndex] <num[j]){
                    maxIndex = j;
                }
            }
            int lastIndex = num.length - 1 - i;

            int temp = num[maxIndex];
            num[maxIndex] = num[lastIndex];
            num[lastIndex] = temp;

        }
        System.out.println(Arrays.toString(num));



    }

}
