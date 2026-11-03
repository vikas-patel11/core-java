package com.core_java.multithread;

public class PriorityThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Priority!");
        System.out.println(Thread.currentThread().getPriority());
    }


    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
        PriorityThread pt = new PriorityThread();
        Thread th = new Thread(pt);
        th.start();
    }
}
