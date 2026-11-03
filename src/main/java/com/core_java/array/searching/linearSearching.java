package com.core_java.array.searching;

public class linearSearching {

    public static void main(String[] args) {
        int [] num = {10,20,30,40,50,60};

        int element=30;
        boolean elementNotFound = true;

        /*for (int nu : num){

            if(nu == element){
                elementNotFound = false;
                System.out.println("Element found!");
                break;
            }
        }*/


        for (int i = 0; i < num.length; i++) {
            if(num[i]==element){
                elementNotFound = false;
                System.out.println("Element found!");
                System.out.println("Index: "+(i));
                break;
            }
        }

        if(elementNotFound){
            System.out.println("Element not found!");
        }

    }
}
