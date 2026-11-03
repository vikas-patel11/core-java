package com.core_java.programs.string;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java is great and Java is fun. Programming in Java is great.";
        StringBuilder sb1 =new StringBuilder();
        for (String word : str.split(" ")) {
            StringBuilder sb =new StringBuilder();
            String reverseStr = sb.append(word).reverse().toString();
            sb1.append(reverseStr).append(" ");
        }

        System.out.println(sb1.toString().trim());
    }
}
