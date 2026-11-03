package com.core_java.collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {

        Map<Integer,Integer> map =new HashMap<>();
        map.put(1,23);
        map.put(2,26);
        map.put(3,230);
        map.put(4,213);




       Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();

       for (Map.Entry<Integer,Integer> e: entrySet){
           System.out.println(e.getKey());
           System.out.println(e.getValue());
        }

       /* Iterator<Map.Entry<Integer, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            System.out.println(next.getKey() );
            System.out.println(next.getValue());
        }*/

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " "+ e.getValue());
        }


        Set<Integer> integers = map.keySet();

        for (Integer e : map.keySet()) {
            System.out.println(e);
        }







    }
}
