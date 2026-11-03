package com.core_java.java8.optional_class;

import java.util.Optional;

public class OptionalClassDemo {


    public static Optional<String> getName(){
//        String name ="vikas";
        String name =null;
        return Optional.ofNullable(name);
    }



    public static void main(String[] args) {
//        Optional<Object> o = Optional.of(null);
//        o.orElse("null value");
//        Optional<Object> empty = Optional.empty();
//        System.out.println(empty.isPresent());
//
//        Optional<Object> o = Optional.ofNullable("kisan");
//        System.out.println(o.orElse("null value"));


        Optional<String> name = getName();
        System.out.println(name.orElse("name not found!!"));
    }
}
