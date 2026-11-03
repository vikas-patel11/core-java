package com.core_java.programs.number;

public class TestFactorialUsingRecursion {

    static int numCount = 0;
    static boolean numFlag = false;
    static long factorialVal = 1;
    public static void main(String[] args) {
        int num = 10;

        long value = getFactorial(num);
        System.out.println(value);
    }

   static long getFactorial(int num){
        if(num == numCount){
            numFlag = true;
        } else {
            if(!numFlag) {
                numCount++;
                factorialVal *= numCount;
                getFactorial(num);
            }
        }
        return factorialVal;
    }
}
