package com.core_java.multithread;

public class ThreadMethods extends Thread  {


    @Override
    public void run(){
        System.out.println("tekno!");
        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().isAlive());

    }


    public static void main(String[] args) {
        System.out.println("hello!");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("vikas");
        System.out.println(Thread.currentThread().getName());
//        System.out.print(10/0);

        ThreadMethods tm =new ThreadMethods();
        tm.setName("dept");
        tm.start();


    }


}
