package com.core_java.array;

public class DeleteElement {

    public static void main(String[] args) {
        int[] num1 = {10, 20, 30, 40, 50};
        int indexPos = 1;

        int[] num2 = new int[num1.length-1];

        for (int i = 0; i < indexPos; i++) {
            num2[i] =num1[i];
        }

        for (int i = indexPos; i <num2.length ; i++) {
            num2[i] = num1[i+1];
        }



        for (int nu : num2){
            System.out.println(nu);
        }
    }




}
