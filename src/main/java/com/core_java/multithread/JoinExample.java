package com.core_java.multithread;

class MyThread1 extends Thread {
    public void run() {
        MyThread2 t2 = new MyThread2();
//        t2.start();

        System.out.println("T2 is live ::"+ t2.isAlive());
        try {
            t2.join(); // wait for t2 once
        } catch(Exception ignored) {}

        for(int i = 1; i <= 5; i++) {
            System.out.println("Child-1 Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch(Exception e) {}
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Child-2 Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch(Exception e) {}
        }
    }
}



public class JoinExample {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();





        try {
            t1.join();   // main thread waits for t1 to finish

        } catch(Exception e) {}

        for(int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
