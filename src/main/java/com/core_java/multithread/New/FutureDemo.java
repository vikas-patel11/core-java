package com.core_java.multithread.New;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

    public static void main(String[] args)
            throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()-> System.out.println("hello"));

        Future<Integer> future = executorService.submit(() -> 5 + 5);

        System.out.println("Is done: " + future.isDone());

        Integer result = future.get();  // waits if task isn't finished
        System.out.println("Result: " + result);

        System.out.println("Is done: " + future.isDone());

        executorService.shutdown();
    }
}
