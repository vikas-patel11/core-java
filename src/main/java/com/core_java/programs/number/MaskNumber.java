package com.core_java.programs.number;

public class MaskNumber {

    public static void main(String[] args) {
        String number = "8853891444";
        if (number.length() < 10) {
            System.out.println("Please enter proper mobile number.");
        }
        // Get the first 2 characters and last 2 characters
        String start = number.substring(0, 2);
        String end = number.substring(number.length() - 2);

        // Create the masked part with '*' characters
        String maskedPart = "*".repeat(number.length() - 4);

        // Combine the start, masked part, and end
        System.out.println(start + maskedPart + end);

    }
}
