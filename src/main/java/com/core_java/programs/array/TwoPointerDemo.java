package com.core_java.programs.array;

public class TwoPointerDemo {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 5, 7, 9};

        int target = 5;

        int left = 0;
        int right = num.length-1;

        while (left<right){
            int total = num[left] + num[right];
            if(total==target){
                System.out.println(num[left] +" + "+ num[right] + " = "+target);
//                break;
            }else if(total<target){
                left++;
            }else {
                right--;
            }
        }


    }
}
