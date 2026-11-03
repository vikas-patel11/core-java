package com.core_java.programs.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String word = "Java is great and Java is fun. Programming in Java is great.";
        StringBuilder stringBuilder =new StringBuilder();
        List<String> list = new ArrayList<>();
        for (String s : word.toLowerCase().split("\\W+")) {
            if(!list.contains(s)) {
                list.add(s);
                stringBuilder.append(s).append(" ");
            }

        }
        System.out.println(stringBuilder.toString().trim());

    }
}
