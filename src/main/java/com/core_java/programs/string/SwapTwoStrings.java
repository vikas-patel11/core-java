package com.core_java.programs.string;

import java.util.ArrayList;
import java.util.List;

public class SwapTwoStrings {
    public static void main(String[] args) {

        String str1 = "sunny";
        String str2 = "jaiswar";
        String str3 = "";

        System.out.println("Before Swap: ");
        System.out.println("STR1: " + str1);
        System.out.println("STR2: " + str2);

//        str3 = str1;
//        str1=str2;
//        str2 =str3;

//        str1 = str1 + str2;
//        str2 = str1.substring(0,str1.length() - str2.length());
//        str1 = str1.substring( str2.length());


        List<Character> list = new ArrayList<>();
        list.add('s');
        list.add('b');
        list.add('1');
        list.add('9');
        list.add('k');

        int numericValue = Character.getNumericValue('1');

        boolean contains= list.contains('1');
        System.out.println("hdscs"+ contains);
        System.out.println("After Swap: ");
        System.out.println("STR1: " + str1);
        System.out.println("STR2: " + str2);

    }





}
