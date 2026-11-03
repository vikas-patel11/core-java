package com.core_java.programs.string;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year = 1900;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("It's leap year!!");
        } else {
            System.out.println("It's not leap year!!");
        }
    }
}
