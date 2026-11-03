package com.core_java.DSA.StringBase;

public class DemoString {
    public static void main(String[] args) {

        String s = "java";
        char[] c = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        StringBuffer sbs = new StringBuffer();
        sbs.append(10);


        for (int i = s.length()-1; i>= 0 ; i--) {
            sb = sb.append(c[i]);
        }

        System.out.println(sb);

        StringBuilder ss = new StringBuilder(s);
        System.out.println(ss.reverse());



       /* int left = 0;
        int right = c.length-1;

        while (left<right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right --;

        }

        System.out.println(c);*/

        String s1 = "educationaaaaaaaaaa";
        for (char c1 : s1.toCharArray()) {
            if(c1=='a'|| c1=='e'){

            }
        }

        long count = s1.chars().filter(v -> "aeiou".indexOf(v) != -1).count();
        System.out.println(count);


    }
}
