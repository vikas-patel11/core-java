package com.core_java;

public class Main {
    public static void main(String[] args) {



        // Check if arguments are passed
        if (args.length > 0) {
            System.out.println("Arguments passed:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No arguments were passed.");
        }



    }



}
 class Demo{}
