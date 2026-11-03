package com.core_java.java8.comparable_and_comparator;

import java.util.*;

public class ComparableAndComparatorDemo {

    public static void main(String[] args) {

        List<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Durgesh","8853891444",21));
        emps.add(new Emp("vikas","8874561324",32));
        emps.add(new Emp("ronak","8853891666",45));

//        emps.stream().sorted(Comparator.comparing(Emp::getName));

        Collections.sort(emps, Comparator.comparing(Emp::getId));



        Set<Emp> data = new LinkedHashSet<>();

        for(int i=0; i<emps.size(); i++){
            Emp emp = emps.get(i);
            data.add(emp);
        }

        System.out.println("setData"+ data);







// setData[Emp{name='Durgesh', phone='8853891444', id=21}, Emp{name='ronak', phone='8853891666', id=45}, Emp{name='vikas', phone='8874561324', id=32}]






//        Collections.sort(emps, (e1, e2) -> Integer.compare(e1.getId(), e2.getId()));

        //comparable
//        Collections.sort(emps);
//        System.out.println(emps);

        // comparator

      /*  Collections.sort(emps, Comparator.comparing(Emp::getName).reversed());
        System.out.println(emps);

        Collections.sort(emps, (e1, e2) -> e1.getId()- e2.getId());


        Collections.sort(emps, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println(emps);*/

    }
}
