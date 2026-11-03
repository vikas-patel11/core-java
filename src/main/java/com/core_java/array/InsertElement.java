package com.core_java.array;

public class InsertElement {

    public static void main(String[] args) {

        int[] num1 = {10, 20, 30, 40, 50};
        int indexPos = 2;
        int element = 100;

        int[] num2 = new int[num1.length+1];


        for (int i = 0; i < indexPos; i++) {
            num2[i] = num1[i];
        }
        num2[indexPos] =element;

        for (int i = indexPos; i <num1.length ; i++) {
            num2[i+1]=num1[i];
        }

        for (int nu:num2){
            System.out.println(nu);
        }
    }
}
