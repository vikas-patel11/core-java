package com.core_java.programs.string;


public class StringContainsOnlyDigits {
    public static void main(String[] args) {
        String word = "lwwfdh1";
        boolean isDigitOnly = true;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
//            if (!Character.isDigit(c)) {
//                isDigitOnly = false;
//                break;
//            }
            if(!Character.isLetter(c)){
                isDigitOnly = false;
                break;
            }
        }
        System.out.println("String Contains Only Digits? : "+ isDigitOnly);


    }
}
