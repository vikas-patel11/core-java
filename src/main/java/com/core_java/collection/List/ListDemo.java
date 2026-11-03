package com.core_java.collection.List;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<Object> arrayList = new ArrayList<>();
        List<Integer> linkList = new LinkedList<>();

        linkList.add(5);
        linkList.add(56);
        linkList.add(15);
        linkList.add(59);


        ListIterator<Integer> integerListIterator = linkList.listIterator();
        while (integerListIterator.hasNext()){
            Integer previous = integerListIterator.next();
            System.out.println(previous);
        }

        int[] num = {5,9,756,23,45};
        List<int[]> list = Arrays.asList(num);

        System.out.println("size: "+ list.size());
        Iterator<int[]> iterator = list.iterator();
        while (iterator.hasNext()){
            int[] next = iterator.next();
            System.out.print (Arrays.toString(next)+ " ");
        }

        ListIterator<int[]> listIterator = list.listIterator();

//        Collections.sort();

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        Collections.sort(linkList);
        System.out.println("ncj: "+linkList);
        Collections.sort(linkList,Comparator.reverseOrder());
        System.out.println("cdcd "+linkList);




    }
}
