package com.core_java.java8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);
        // Submit tasks for parallel execution
        Future<?> future1 = executor.submit(ExecutorServiceDemo::task1);
        Future<?> future2 = executor.submit(ExecutorServiceDemo::task2);
        Future<?> future3 = executor.submit(ExecutorServiceDemo::task3);

        // Wait for all tasks to complete
        future1.get();
        future2.get();
        future3.get();

        // Shutdown the executor
        executor.shutdown();
    }

    public static void task1() {
        try {
            Thread.sleep(1000); // Simulate task taking 1 second
            System.out.println("Task 1 completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void task2() {
        try {
            Thread.sleep(1500); // Simulate task taking 1.5 seconds
            System.out.println("Task 2 completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void task3() {
        try {
            Thread.sleep(500); // Simulate task taking 0.5 seconds
            System.out.println("Task 3 completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
