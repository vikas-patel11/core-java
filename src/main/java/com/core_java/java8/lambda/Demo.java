package com.core_java.java8.lambda;

import com.core_java.multithread.RunnableThread;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo  {
    public static void main(String[] args) {
        /*Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in thread (Java 7 style)");
            }
        });

        t.start(); // starts the new thread*/




       /* Thread t = new Thread(()-> System.out.println("hello!!"));
        t.start();*/


        Runnable runnable = ()->{
            System.out.println("hello");
        };
        Thread th = new Thread(()-> System.out.println("hello"));
        th.start();


        List<String> names = Arrays.asList("Vikas", "Patel", "Amit");
        Collections.sort(names);

        System.out.println(names);

    }






}
