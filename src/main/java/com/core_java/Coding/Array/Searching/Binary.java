package com.core_java.Coding.Array.Searching;

public class Binary {
    public static void main(String[] args) {

        int[] num = {2,3,5,7,9,12,26,34,45,50,65};

        int target = 12;

        int left = 0;
        int right = num.length-1;

        while (left<=right){
            int mid = (left+right)/2;

            if(num[mid]==target){
                System.out.println("index: "+mid);
                break;
            }else if (num[mid]<target){
                left = mid+1;
            }else {
                right= mid-1;
            }
        }

    }
}
