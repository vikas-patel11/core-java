package com.core_java.leetCode.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {

        String s = "MCMXCIV";
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total =0;
        char[] charArray = s.toCharArray();
        // Iterate through the string
        for (int i = 0; i < charArray.length; i++) {
            // Get the value of the current character
            int currentValue = map.get(charArray[i]);

            // Check if this is the last character or if the current value is greater than or equal to the next value
            if (i + 1 < charArray.length && currentValue < map.get(charArray[i + 1])) {
                // If the next character is larger, subtract the current value
                total -= currentValue;
            } else {
                // Otherwise, add the current value
                total += currentValue;
            }
        }
        System.out.println("total : " + total );
    }
}
