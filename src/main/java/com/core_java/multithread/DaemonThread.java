package com.core_java.multithread;

public class DaemonThread extends Thread {

    @Override
    public void run(){

        if(Thread.currentThread().isDaemon()){

            System.out.println("Daemon Thread!");
        }else {
            System.out.println("Not Daemon Thread!");
        }
    }



    public static void main(String[] args) {

        System.out.println("hello!");
        DaemonThread dt =new DaemonThread();
        dt.setDaemon(true); // 1. we can not create a main thread as daemon thread. 2.set daemon before start a thread
        dt.start();
    }
}
