package com.core_java.multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafe {

    AtomicInteger atomicInteger = new AtomicInteger(0);

    int count = 0;

    public void increment() {
//        count++;
        atomicInteger.incrementAndGet();
    }

//    public synchronized void increment() {
//        count++;
//    }

    public static void main(String[] args) throws InterruptedException {

        ThreadSafe th = new ThreadSafe();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                th.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                th.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected count : 200000");
//        System.out.println("Actual count   : " + th.count);
        System.out.println("Actual count   : " + th.atomicInteger.get());
    }
}