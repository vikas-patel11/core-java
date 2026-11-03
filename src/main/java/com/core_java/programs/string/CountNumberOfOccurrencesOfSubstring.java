package com.core_java.programs.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountNumberOfOccurrencesOfSubstring {
    public static void main(String[] args) {
        String sentence = "Java rav is great. Java is fun. Java is powerful.";
        String substring = "java";

//        String[] split = sentence.toLowerCase().split(substring);
//        for (String s : split) {
//            System.out.println("Splite : " + s);
//
//        }
//
//        int count = split.length - 1;
//        System.out.println("Total Count : " + count);

        Matcher matcher = Pattern.compile(substring).matcher(sentence.toLowerCase());
        int count=0;
        while (matcher.find()){
            count++;
        }
        System.out.println("Total Count : " + count);
    }
}
