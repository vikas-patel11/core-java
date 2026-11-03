package com.core_java.multithread.New;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            int taskId = i;
            executorService.execute(()->{
                System.out.println("task : "+ taskId +" by "+Thread.currentThread().getName());
            });

        }
        Future<?> submit = executorService.submit(() ->10*10);
        System.out.println(submit.get());
        System.out.println("vikas");

    }
}
