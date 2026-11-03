package com.core_java.multithread;

import java.util.concurrent.*;

public class CallableDemo implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Callable task running");
        int a = 25*2;
        return a;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> submit = executorService.submit(new CallableDemo());
        System.out.println("dhvc : "+submit.get());
        executorService.shutdown();


    }
}
