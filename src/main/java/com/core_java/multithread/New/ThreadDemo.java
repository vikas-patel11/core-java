package com.core_java.multithread.New;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started...");

       Thread t1= new Thread(
               ()-> {
                   try {
                       Thread.sleep(2000);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   System.out.println("t1 thread");
               }
       );
       t1.start();
       t1.join(); // main thread wait until t1 thread join

       System.out.println("Main thread end...");
    }
}
