package com.core_java.collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator12 {

    public static void main(String[] args) {

        List list= new ArrayList<Integer>();
        list.add(25);
        list.add(95);
        list.add(52);
        list.add(29);

        ListIterator <Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
//            listIterator.add(6666);
            System.out.println(listIterator.next());
        }

        System.out.println("----------------------");
        listIterator.add(6666);
        for (Object a : list){
            System.out.println(a);
        }


    }
}
