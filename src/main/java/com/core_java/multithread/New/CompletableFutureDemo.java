package com.core_java.multithread.New;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo {

    public static void main(String[] args) {

        CompletableFuture<Void> hello =
                CompletableFuture.runAsync(() -> {
                    System.out.println("Hello");
                });

        hello.thenRun(() -> {
            System.out.println("Task 2");
        }).thenRun(() -> {
            System.out.println("Task 3");
        });


        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> "hello")
                .thenApply(x -> x.toUpperCase())
                .thenApply(x -> x + "vikas");

        System.out.println(stringCompletableFuture.join());



    }
}
