package com.core_java.collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {
    public static void main(String[] args) {

        Map<Object, Object> map = new HashMap<>();
        map.put(1, "vikas1");
        map.put(2, "vikas2");
        map.put(3, "vikas3");
        map.put(4, "vikas4");
        map.put(null, "vikas4");
        map.put("tekno", "point");

        int[] num =new int[10];
        num[0]=5;

        int[] num1 ={12,85,96,45};

        System.out.println("size: "+map.size());

        Set<HashMap.Entry<Object, Object>> setEntry = map.entrySet();
        for (HashMap.Entry<Object, Object> entry : setEntry) {
            System.out.println(entry.getKey() + " $$ " + entry.getValue());
        }
        TreeMap map1 =new TreeMap<>();
    }
}
