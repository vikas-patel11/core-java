package com.core_java.optionalclass;

import java.util.Optional;

public class DemoOptionalClass {

    public static void main(String[] args) {

        String name = "my name is vikas";
//        String name = "";
//        String name = null;

//        System.out.println("length:- "+ name.length());

        Optional<String> name1 = Optional.ofNullable(name);
        System.out.println(name1.isEmpty());

        System.out.println(name1.orElse("nahi hoga!!"));
        try {
            System.out.println(name1.orElseThrow(() -> new RuntimeException("Name is missing!")));
        } catch (RuntimeException e) {
            System.out.println("exception:-> "+e.getMessage());
        }
    }
}
