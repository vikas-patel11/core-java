package com.core_java.java8.comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(150);
        list.add(197);
        list.add(5);
        list.add(62);


        List<String> list1 = new ArrayList<>();

        list1.add("vikas");
        list1.add("anad");
        list1.add("tekno");
        list1.add("zerbtra");
        list1.add("cat");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);



        List<Emp> demo = new ArrayList<>();

        demo.add(new Emp("vikas","8853891444",10));
        demo.add(new Emp("cat","8853891444",101));
        demo.add(new Emp("tekno","8853891444",5));
        demo.add(new Emp("zero","8853891444",52));

        System.out.println(demo);
        Collections.sort(demo);
        System.out.println(demo);

        Collections.sort(demo, (e1, e2) -> e1.getId()-e2.getId());

        Collections.sort(demo, Comparator.comparing(Emp::getId));
        System.out.println(demo);

        Collections.sort(demo,(e1,e2)->e1.getId()-e2.getId());
        System.out.println(demo);

        Collections.sort(demo,(e1,e2)->e1.getName().compareTo(e2.getName()));
        System.out.println(demo);

        Collections.sort(demo,Comparator.comparing(Emp::getName));
        System.out.println("demo::"+demo);




    }
}
