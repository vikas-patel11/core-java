package com.core_java.Coding.Array.Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6};

        boolean swapped;

        for (int i = 0; i < num.length - 1; i++) {

            swapped = false;

            for (int j = 0; j < num.length - 1 - i; j++) {

                if (num[j] > num[j + 1]) {

                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(num));
}
}
