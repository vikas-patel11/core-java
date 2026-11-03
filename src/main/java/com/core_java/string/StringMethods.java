package com.core_java.string;

public class StringMethods {

    public static void main(String[] args) {


       /* String name = "vikas patel";

        *//*System.out.println(String.join(";","vudu","cdh"));
        String s = name.split("")[0];
        System.out.println(name.split("")[0]);
        System.out.println(name.substring(2,4));
*//*
        System.out.println(name.contains("p"));
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.charAt(2));*/

        /*String name = null;
//        String string = name.toString();
        String string = String.valueOf(name);
        System.out.println(string);*/


        StringBuilder sb = new StringBuilder();
        System.out.println(sb.toString());

        String n = "d.c.f";
        String[] split = n.split("\\.");
        System.out.println(split.length);


        StringBuffer buffer = new StringBuffer();

        buffer.append("Hello");


    }
}
