package com.core_java.Coding.Array.TwoPointer;

import com.google.gson.JsonObject;
import com.mysql.cj.xdevapi.JsonArray;

import java.util.*;

public class TwoPointerDemo {

    public static void main(String[] args) {

        int[] num = {2, 4, 6, 7, 8, 9, 5, 3};
        Arrays.sort(num);

        List<String> list = new ArrayList<>();

        int target = 12;

        int left =0 ;
        int right = num.length-1;

        while (left<right){

            int sum = num[left]+num[right];
            if(sum==target){
            list.add("{" + num[left] + ":" + num[right] + "}");
                // break;  // if need first only
                left++;
                right--;
            }else if(sum<target){
                left++;
            }else {
                right--;
            }


        }

        System.out.println(list);















    }
}
