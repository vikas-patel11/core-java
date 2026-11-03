package com.core_java.exception;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            int num1 = 10, num2 = 0;
            int num3 = num1 / num2;

            System.out.println("ans: " + num3);
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getMessage());
        }


    }
}
