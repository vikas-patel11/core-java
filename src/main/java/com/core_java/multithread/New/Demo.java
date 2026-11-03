package com.core_java.multithread.New;

import com.core_java.array.Array;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        int [] num = {0,1,0,12,3};

        int left =0;
        int right = num.length-1;

        while (left<right){

            if(num[left]==0 && num[right]!=0){
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;

                left++;
                right--;

            } else if (num[left] != 0) {
                left++;

            } else if (num[right] == 0) {
                right--;
            }
        }



       /* for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < i; j++) {
                if (num[j+1]>0){
                    int temp = num[j+1];
                    num[j+1]= num[j];
                    num[j]= temp;
                }
            }
        }*/

        System.out.println(Arrays.toString(num));
    }
}
