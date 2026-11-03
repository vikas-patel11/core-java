package com.core_java.Coding.Array.Searching;

public class Linear {
    public static void main(String[] args) {

        int[] num = {3,7,5,9,3,6,1};

        int target = 6;

        for (int i = 0; i < num.length; i++) {
            if(num[i]==target){
                System.out.println("index: " +  i);
                break;
            }
        }


    }

}
