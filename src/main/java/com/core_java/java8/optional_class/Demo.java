package com.core_java.java8.optional_class;

import java.util.Optional;

import static java.util.TimeZone.getDefault;

public class Demo {


    public static String getName(Optional<String> name){

//        String str = name.orElseThrow().toString();

        String str = name.orElseGet(() -> "viaks").toUpperCase();

//        String str = name.orElse("patel").toString().toUpperCase();
//        String str = name.get().toString().toUpperCase();
        return str;
    }


    public static void main(String[] args) {

        /*String name = null;
        if(name != null) {
            System.out.println(name.length());
        }else {
            System.out.println("name is null");
        }*/


        // create Optional
        Optional<String> vikas = Optional.of("vikas");
        Optional<String> name = Optional.ofNullable("null");
        Optional<Object> empty = Optional.empty();

        System.out.println(name.isEmpty());
        System.out.println(name.orElse("demo"));

        String name1 = getName(Optional.ofNullable(null));
        System.out.println("upperCase : : " + name1);



        String str = "hello";
        if(str.equals("hello")){
            System.out.println("match");
        }else {
            System.out.println("not");
        }


    }
}
