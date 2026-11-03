package com.core_java.java8.method_reference;

import java.util.function.Consumer;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        System.out.println("Learning Method Reference !!");


        // lambda expression
        WorkInterface workInterface =()-> System.out.println("This is do Task new Method !!");
        workInterface.doTask();

        // Method Reference

        WorkInterface doStuff = Stuff::doStuff;
        doStuff.doTask();

        Stuff s = new Stuff();
        WorkInterface print = s::print;
        System.out.println(print);


    }
}
