package com.core_java.programs.number;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int num = 5;
        int totalSum = 0;
        for (int i = 1; i <= 5; i++) {
            totalSum += i;
        }
        System.out.println("Total : " + totalSum);

        //recursion
        int sum = 0;
        int sumValue = getSumValue(num, sum);
        System.out.println("Total Sum : " + sumValue);

    }

    public static int getSumValue(int num, int sum) {
        sum += num;
        num--;
        if (num > 0) {
            sum = getSumValue(num, sum);
        }
        return sum;

    }
}
