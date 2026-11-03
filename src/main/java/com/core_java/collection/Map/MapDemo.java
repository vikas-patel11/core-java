package com.core_java.collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");




        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("**********************************************");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
           if(entry.getKey()==4){
               map.remove(entry.getKey());
           }

        }
        System.out.println(map);

//        map.forEach((integer, entry) -> {
//            if(integer==4){
//                map.remove(integer);
//            }
//            System.out.println(integer+" : "+entry);
//        });

//        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Integer, String> entry = iterator.next();
//            if (entry.getKey() == 4) {
//                iterator.remove();
//            }
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }


        Map<Integer,String> mapName=new LinkedHashMap<>();
        mapName.put(1,"Satya Yadav");
        mapName.put(2,"Sunil Raj");
        mapName.put(3,"Ajay Makhan");
        mapName.put(4,"Vishal Singh");
        Iterator<Map.Entry<Integer, String>> iterator = mapName.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (entry.getKey() == 2) {
                iterator.remove();
            }
        }

        System.out.println(mapName);


    }
}
