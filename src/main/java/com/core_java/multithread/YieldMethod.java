package com.core_java.multithread;

public class YieldMethod extends Thread{

    @Override
    public void run(){

        for (int i = 0; i <100; i++) {

            System.out.println("demo");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        YieldMethod yieldMethod =new YieldMethod();
//        Thread.sleep(20000);
        yieldMethod.start();
        //Thread.yield();

        yieldMethod.join();

        for (int i = 0; i < 10; i++) {

            System.out.println("Main");

        }

    }
}
