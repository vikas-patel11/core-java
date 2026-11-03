package com.core_java.collection.List;

import java.util.*;

public class ArrayListDemo {

    List list =new ArrayList<>();


    public static void main(String[] args) {
        ArrayList arrayList1 =new ArrayList<>();
        arrayList1.add(5);
        arrayList1.add(55);
        arrayList1.add(50);
        arrayList1.add(60);
        arrayList1.add(65);

        System.out.println("vvc " +arrayList1.toString());


        ArrayList arrayList2 =new ArrayList<>();
        arrayList2.add(6);
        arrayList2.add(65);
        arrayList2.add(60);
        arrayList2.add(65);


//        arrayList1.addAll(arrayList2) ;


        System.out.println(arrayList1.contains(5));

        arrayList1.ensureCapacity(20);

        System.out.println(arrayList1.size());

        System.out.println(arrayList2.indexOf(65));
        System.out.println(arrayList2.lastIndexOf(65));

        System.out.println("-----------------------------------");
        Iterator iterator = arrayList2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }

        System.out.println("-----------------------------------");
        ListIterator listIterator = arrayList2.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
//            System.out.println(listIterator.hasPrevious());
//            System.out.println(listIterator.previous());
            System.out.println(listIterator.nextIndex());
            System.out.println(listIterator.previousIndex());




        }


        System.out.println("-----------------------------------");
        ListIterator listIterator1 = arrayList2.listIterator();
        while (listIterator1.hasNext()){
            System.out.println(listIterator1.next());

        }

        System.out.println("sublist: "+arrayList1.subList(1,3));
        Spliterator spliterator = arrayList1.spliterator();
        spliterator.forEachRemaining(e-> {
            System.out.println("spliterator: " + e);
        });



        Spliterator spliterator1 = arrayList1.spliterator();
        spliterator.forEachRemaining(e->
            System.out.println("spliterator: " + e)
        );

        arrayList1.retainAll(arrayList2);
        System.out.println("similar: "+arrayList1);




    }
}
