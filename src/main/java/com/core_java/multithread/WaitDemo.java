package com.core_java.multithread;

public class WaitDemo {

    static Object lock = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            synchronized (lock) {

                System.out.println("T1: started");

                try {
                    System.out.println("T1: waiting...");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("T1: resumed");
            }
        });


        Thread t2 = new Thread(() -> {

            synchronized (lock) {

                System.out.println("T2: notify called");

                lock.notify();
            }
        });


        t1.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        t2.start();
    }
}