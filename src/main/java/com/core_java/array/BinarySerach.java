package com.core_java.array;

import java.util.Arrays;

public class BinarySerach {

    public static void main(String[] args) {


        int [] num = {5,8,25,86,24,53,64,89,21};

        Arrays.sort(num);

        int key  = 53;

        int s= 0;
        int e = 8;
        boolean found = false;
        int pos = 0;

        while (s<=e){

            int mid = (s+e)/2;

            if(num[mid] ==key){
                found =true;
                pos= mid+1;
                break;
            }else if(num[mid]<key){
                s=mid+1;
            }else {
                e=mid-1;
            }

        }

        if (found){
            System.out.println("position ::: "+pos);
        }else {
            System.out.println("value not found!");
        }


    }
}
