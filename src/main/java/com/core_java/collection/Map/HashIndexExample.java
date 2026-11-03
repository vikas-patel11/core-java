package com.core_java.collection.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashIndexExample {
    public static void main(String[] args) {
        String key = "vikacgvdgs";
        int hashCode = key.hashCode(); // e.g., 69609650
        int arrayLength = 16;

        int index = hashCode & (arrayLength - 1);

        System.out.println("HashCode: " + hashCode);
        System.out.println("Index: " + index); // Between 0 and 15



        ConcurrentHashMap<Object,Object> map = new ConcurrentHashMap<>();
        map.put("cvfh","bchd");
        map.put("key","vs");
        System.out.println(map.get("cndbjc"));


    }
}

