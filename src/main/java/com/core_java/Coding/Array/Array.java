package com.core_java.Coding.Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class Array {

    public static void main(String[] args) {

        int[] num = {2,4,6,7,8,9,5,3};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int target = 12;

        int left = 0;
        int right=num.length-1;

        while (left < right){
            int sum = num[left]+num[right];
            if(sum==target){
                System.out.println(num[left] +" + "+num[right] + " = "+ target);
                break;
            }else if (sum<target){
                left++;
            }else {
                right--;
            }
        }

    }
}
