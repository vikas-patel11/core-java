package com.core_java;

import java.security.SecureRandom;

public class SecureRandomExample {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        int number = secureRandom.nextInt(10); // 0–99
        System.out.println(number);
//        int otp = secureRandom.nextInt(1000000);
//        System.out.println("OTP: " + otp);

        for (int i = 0; i < 500; i++) {
            int otp = secureRandom.nextInt(1000000);
            System.out.println(otp);
        }
    }
}
