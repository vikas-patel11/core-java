package com.core_java.collection.Set;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(101);
        set.add(5);
        set.add(450);

        for (Integer integer : set) {
            System.out.println(integer);  // 10 only
        }

        // maintain insertion oder
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(101);
        set1.add(10);
        set1.add(4510);
        set1.add(19);

        System.out.println("*************************");
        for (Integer integer : set1) {
            System.out.println(integer);
        }

        System.out.println("*************************");
        Set<Integer> set2 =new TreeSet<>();
        set2.add(101);
        set2.add(10);
        set2.add(4510);
        set2.add(19);
        for (Integer integer : set2) {
            System.out.println(integer);
        }


        LinkedHashSet<Integer>linkedHashSet =new LinkedHashSet<>();
        linkedHashSet.add(23);

        TreeSet<Integer> treeSet =new TreeSet<>();
        treeSet.add(5);
        treeSet.add(52);
        treeSet.add(75);
        treeSet.add(556);
        treeSet.add(45);


        System.out.println(treeSet);




    }
}
