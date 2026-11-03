package com.core_java.programs.string;

public class FindAllPermutations {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Permutations of the string are:");
        findPermutations(str, "");
    }

    public static void findPermutations(String str, String prefix) {
        if (str.isEmpty()) {
            // Base case: If the string is empty, print the prefix
            System.out.println(prefix);

        } else {
            for (int i = 0; i < str.length(); i++) {
                // Choose the character at index i
                char ch = str.charAt(i);

                // Form the remaining string after removing the character at index i
                String remaining = str.substring(0, i) + str.substring(i + 1);

                // Recurse with the remaining string and the prefix updated with the chosen character
                findPermutations(remaining, prefix + ch);
            }
        }
    }
}
