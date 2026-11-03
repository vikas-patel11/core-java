package com.core_java.collection.Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(101);
        set.add(110);
        System.out.println(set.remove(101));

        TreeSet<Object> objects = new TreeSet<>();
        objects.add(10);

    }


}
