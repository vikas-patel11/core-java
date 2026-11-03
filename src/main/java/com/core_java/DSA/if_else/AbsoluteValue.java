package com.core_java.DSA.if_else;

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        System.out.print("Enter a value : ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a<0){
            a= -a;
        }
        System.out.println("A: "+ a);
    }
}
