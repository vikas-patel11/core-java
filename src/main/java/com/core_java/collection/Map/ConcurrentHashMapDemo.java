package com.core_java.collection.Map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {

//        Scanner sc= new Scanner(System.in);
//        sc.nextInt();

        Map map = new HashMap();
        map.put('a',"vikas");
        map.put('b',null);

        System.out.println("A::"+map.get('a'));
        System.out.println("B::"+map.get('b'));
        System.out.println("C::"+map.get('c'));
        System.out.println(map.containsKey('v'));

        ConcurrentHashMap cmap = new ConcurrentHashMap<>();

        cmap.put('a',"vikas");
        cmap.put('b',null);
        System.out.println("A::"+cmap.get('a'));
        System.out.println("B::"+cmap.get('b'));
        System.out.println("C::"+cmap.get('c'));
        System.out.println(cmap.containsKey('v'));


    }
}
