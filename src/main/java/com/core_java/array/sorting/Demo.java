package com.core_java.array.sorting;

import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {

        // Level 1 → vikas
        // Level 2 → secu, semi
        // Level 3 → min
        Map<String, Map<String, Map<String, Integer>>> data = new HashMap<>();

        // Add: vikas -> secu -> min = 100
        data
                .computeIfAbsent("vikas", k -> new HashMap<>())
                .computeIfAbsent("secu", k -> new HashMap<>())
                .put("min", 100);

        // Add: vikas -> semi -> min = 5000
        data
                .computeIfAbsent("vikas", k -> new HashMap<>())
                .computeIfAbsent("semi", k -> new HashMap<>())
                .put("min", 5000);

        // Print output
        System.out.println(data);
    }
}
