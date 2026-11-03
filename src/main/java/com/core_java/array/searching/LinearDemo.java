package com.core_java.array.searching;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LinearDemo {

    public static void main(String[] args) {

        int[] num = {5,9,4,7,5,6,4,3};
        int target = 4;
        boolean isfound = false;
        /*int index = 0;
        for (int a: num){
            if(a==2){
                System.out.println("index:: "+index);

            }
            index++;
        }*/

        for(int i =0;i<num.length;i++){

            if(num[i]==target){
                System.out.println("index  :::: "+i);
                isfound=true;
                break;
            }

        }

        if(!isfound){
            System.out.println("target value not found!! "+ target);
        }

        // using stream api

        int index = IntStream.range(0,num.length).filter(i->num[i]==target).findFirst().orElse(-1);
        System.out.println(index);

    }
}
