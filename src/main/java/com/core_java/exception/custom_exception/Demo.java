package com.core_java.exception.custom_exception;

import java.util.Scanner;

public class Demo {

    public static void main(String [] args) throws AgeException{

        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try {
            if (age < 18) {
                throw new AgeException("Minor");
            }
            System.out.println("Adult");
        }catch (AgeException e){
            e.printStackTrace();
        }
        System.out.println("hello");

    }
}