package com.core_java.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newFixedThreadPool(2);

        for(int i=1;i<=5;i++){

            int task = i;

            executor.submit(() -> {
                System.out.println(
                        "Task " + task +
                                " executed by " +
                                Thread.currentThread().getName()
                );
            });
        }

        executor.shutdown();
    }
}
