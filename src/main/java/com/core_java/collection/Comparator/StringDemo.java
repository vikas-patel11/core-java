package com.core_java.collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringDemo  implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("vikas");
        list.add("patel");
        list.add("tekno");
        list.add("point");

        /*Collections.sort(list,String::compareTo);
        System.out.println(list);*/

        list.sort(new StringDemo());
        System.out.println(list);
    }
}
