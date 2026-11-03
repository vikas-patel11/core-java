package com.core_java.multithread;

public class Demo1Prac extends Thread {

    @Override
    public void  run(){
        System.out.println("hello");

    }



    public static void main(String[] args) {

        Demo1Prac thread =new Demo1Prac();
        thread.start();

    }
}
