package com.core_java.programs.string;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String word = "programming";
        int vowelsCount = 0;
        int ConsonantsCount = 0;

        for (int i = 0; i < word.length()-1; i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            } else {
                ConsonantsCount++;
            }
        }


//        for (char c : word.toLowerCase().toCharArray()) {
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                vowelsCount++;
//            } else {
//                ConsonantsCount++;
//            }
//        }

        System.out.println("Total Vowels : "+ vowelsCount);
        System.out.println("Total Consonants : "+ ConsonantsCount);

    }
}
