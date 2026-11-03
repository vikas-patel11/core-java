package com.core_java.array.searching;

import java.util.Arrays;

public class BinarySearching {

  /*  public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50, 60};

        int element = 60;
        boolean elementNotFound = true;

        int li = 0;
        int hi = num.length-1;



        while (li <= hi) {
            int mi = (li + hi) / 2;  // middle index

            if (num[mi] == element) {
                System.out.println("Element " + element + " found at index : " + mi);
                elementNotFound = false;
                break;
            } else if (element < num[mi]) {
                hi = mi - 1; // search left side
            } else {
                li = mi + 1; // search right side
            }
        }

        if (elementNotFound) {
            System.out.println("Element " + element + " not found!");
        }
    }*/

    public static void main(String [] args){

        int[] num = {10,20,25,35,45,50,55,60,70};

        int idx = Arrays.binarySearch(num, 25);

        System.out.println("Binary search (3): index = " + idx); // index = 2

        int target = 552;

        int li=0;
        int hi=num.length-1;
        boolean targetNotFound = true;

        while (li<=hi){
            int mi = (li+hi)/2;
            if(target==num[mi]){
                System.out.println(target + " found at "+mi + " index");
                targetNotFound=false;
                break;
            }else if(target<num[mi]){
               hi=mi-1;
            }else {
                li=mi+1;
            }

        }



        if(targetNotFound){
            System.out.println(target + " not found! ");
        }



    }
}