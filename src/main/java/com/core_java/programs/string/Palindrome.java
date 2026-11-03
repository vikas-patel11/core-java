package com.core_java.programs.string;

public class Palindrome {

    public static void main(String[] args) {

        String name = "Java is great and Java is fun. Programming in Java is great.";

        StringBuffer sb = new StringBuffer();
        //Reverse
        for (int i = name.length()-1; i>=0; i--) {
            char a = name.charAt(i);
            sb.append(a);


        }

//        String sbr = new StringBuffer(name).reverse().toString();

        if (name.contentEquals(sb)) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }

    }


}
