package com.core_java.multithread;

public class Demo extends Thread {

    @Override
    public void run(){

        for(int i =0;i<200;i++) {
            System.out.println("Run");
            System.out.println("Run ::"+currentThread().getName());
        }
    }

    public void show(){
        for(int i=0;i<200;i++){
            System.out.println("Show");
            System.out.println("Show ::"+currentThread().getName());
        }

    }

    public static void main(String [] args){

        Demo t =new Demo();
        t.start();
        t.show();
        Demo t2 = new Demo();
        t2.start();
        Demo t3 = new Demo();
        t3.start();


    }

}
