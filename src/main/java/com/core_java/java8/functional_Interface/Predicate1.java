package com.core_java.java8.functional_Interface;

import java.util.function.Predicate;

public class Predicate1 {

    public static void main(String[] args) {

        Predicate<String> predicate1 = str-> str.trim().startsWith("v");
//        boolean vikas = predicate1.test(" 1vikas");
//        System.out.println(vikas);

        Predicate<String> predicate2 = str->str.length()>10;
//        System.out.println(predicate2.test("vhhi jvbhudgdcdddddddsdhuv"));


        Predicate<Integer> predicate3 = num-> num ==10;
        Predicate<String> or = predicate1.or(predicate2);
        System.out.println("OR " +or.test("fvbhddccddddd"));

        boolean and = predicate1.and(predicate2).test("fvbhddccddddd");
        System.out.println("AND : "+and);


    }
}
