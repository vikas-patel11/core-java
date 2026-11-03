package com.core_java.multithread;


public class ThreadByClass extends Thread {


    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("vikas");
            System.out.println(currentThread().getName());
        }
    }

    public void show(){
        for (int i = 0; i <=5 ; i++) {
            System.out.println("patel");
            System.out.println(currentThread().getName());
        }

    }



    public static void main(String[] args) {
        ThreadByClass threadByClass = new ThreadByClass();
        threadByClass.start();
        threadByClass.show();
    }
}
