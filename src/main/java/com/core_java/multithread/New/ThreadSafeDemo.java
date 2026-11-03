package com.core_java.multithread.New;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeDemo {

    int num  = 0;

    AtomicInteger atomicInteger = new AtomicInteger();




//     volatile int num = 0;
//      AtomicInteger num = 0;
//      AtomicInteger num = new AtomicInteger();

//    public synchronized int getNumCount() {
//            num++;
//            return num;
//    }


//    public int getNumCount() {
//
//        synchronized (this){
//            num++;
//            return num;
//        }
//
//    }

    public int getNumCount() {
        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger.incrementAndGet());
        System.out.println(atomicInteger.decrementAndGet());
        System.out.println(atomicInteger.getAndAdd(5));
        System.out.println(atomicInteger.addAndGet(5));
//        AtomicInteger ad = new AtomicInteger(5);
//        return atomicInteger.accumulateAndGet(5,x->x+2)
        return 50;
    }

    public static void main(String[] args) {

        ThreadSafeDemo obj = new ThreadSafeDemo();

        Thread t1 = new Thread(() -> {
            System.out.println(
                    Thread.currentThread().getName() + " : " + obj.getNumCount()
            );
        }, Thread.currentThread().getName());

//        Thread t2 = new Thread(() -> {
//            System.out.println(
//                    Thread.currentThread().getName() + " : " + obj.getNumCount()
//            );
//        }, Thread.currentThread().getName());
//
//        Thread t3 = new Thread(() -> {
//            System.out.println(
//                    Thread.currentThread().getName() + " : " + obj.getNumCount()
//            );
//        }, Thread.currentThread().getName());
//        Thread t4 = new Thread(() -> {
//            System.out.println(
//                    Thread.currentThread().getName() + " : " + obj.getNumCount()
//            );
//        }, Thread.currentThread().getName());

        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
    }
}
