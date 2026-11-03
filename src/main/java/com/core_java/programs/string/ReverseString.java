package com.core_java.programs.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "vikas";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i>= 0; i--) {
            char c = str.charAt(i);
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder);
        String reverseStr = new StringBuilder(str).reverse().toString();
        System.out.println(reverseStr);
    }
}
