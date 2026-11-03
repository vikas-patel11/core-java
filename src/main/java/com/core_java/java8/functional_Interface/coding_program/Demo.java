package com.core_java.java8.functional_Interface.coding_program;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {


        Predicate<Integer> num = n->n>50;
        System.out.println(num.test(60));

//        Predicate<Integer> greater50 =  a->
//            System.out.println(a>50);



        Consumer<Integer> testee = a->{
            System.out.println(a*a);

        };
        testee.accept(5);






    }
}
