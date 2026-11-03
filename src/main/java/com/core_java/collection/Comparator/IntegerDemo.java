package com.core_java.collection.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntegerDemo implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }




    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(250);
        list.add(20);
        list.add(2);
        list.add(25);


        list.sort(new IntegerDemo());
        System.out.println(" cvsg : "+list);
    }
}
