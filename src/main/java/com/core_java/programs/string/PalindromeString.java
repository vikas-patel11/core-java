package com.core_java.programs.string;

public class PalindromeString {
    public static void main(String[] args) {
        String str="madam";
        char[] charArray = str.toCharArray();
        String stringBuilder =new StringBuilder(str).reverse().toString();
        StringBuffer stringBuffer =new StringBuffer(str).reverse();
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        for (int i = charArray.length; i > 0; i--) {
            System.out.print(charArray[(i-1)]);
        }

        System.out.println();
        if(str.equals(stringBuilder)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }


}
