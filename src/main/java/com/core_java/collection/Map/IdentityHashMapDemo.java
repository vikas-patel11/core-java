package com.core_java.collection.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = new String("Java");

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put(s1, 1);
        hashMap.put(s2, 2);

        System.out.println(hashMap.size()); // 1

        Map<String, Integer> identityMap = new IdentityHashMap<>();
        identityMap.put(s1, 1);
        identityMap.put(s2, 2);

        System.out.println(identityMap.size()); // 2
    }
}
