package com.core_java.multithread;

public class ThreadByRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("vikas");
        }
    }

    public void show(){
        for (int i = 0; i <=5 ; i++) {
            System.out.println("patel");
        }

    }


    public static void main(String[] args) {
        ThreadByRunnable threadByRunnable =new ThreadByRunnable();
        Thread thread =new Thread(threadByRunnable);
        thread.start();
        threadByRunnable.show();
    }
}
