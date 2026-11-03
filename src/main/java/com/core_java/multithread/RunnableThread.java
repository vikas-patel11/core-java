package com.core_java.multithread;

public class RunnableThread  implements Runnable  {
    @Override
    public void run() {

        for (int i = 0; i < 500; i++) {

            System.out.println("Run");


        }
    }

    public void show(){
        for (int i = 0; i < 500; i++) {

            System.out.println("show");

        }
    }

    public static void main(String [] args){
        RunnableThread rt = new RunnableThread();
        Thread t = new Thread(rt);
        t.start();
        rt.show();

    }



}
