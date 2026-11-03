package com.core_java.multithread;

public class InterruptMethod extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.interrupted());

        System.out.println(Thread.currentThread().isInterrupted());


        for (int i = 0; i < 5; i++) {
            System.out.println("hello!");
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("error!");
            }
        }

    }

    public static void main(String[] args) {
        InterruptMethod im = new InterruptMethod();
        im.start();
        im.interrupt(); // interrupt doesn't kill the thread its just 1st interrupt after that is clean


    }
}
