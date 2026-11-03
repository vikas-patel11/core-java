package com.core_java.programs.number;


import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int num = 5;

        // by normal
        long totalValue = 1;

        for (int i = num; i > 0; i--) {
            totalValue = totalValue * i;
        }
        System.out.println("final : " + totalValue);

        // by recursion
        int finalValue = 1;
        finalValue = getFactorialValue(num, finalValue);
        System.out.println("FactorialValue : " + finalValue);


    }

    public static int getFactorialValue(int num, int finalValue) {
        finalValue = finalValue * num;
        num--;
        if (num > 0) {
            finalValue = getFactorialValue(num, finalValue);
        }
        return finalValue;
    }
}
