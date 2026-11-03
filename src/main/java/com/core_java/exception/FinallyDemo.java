package com.core_java.exception;

public class FinallyDemo {

    public static void main(String [] args){

        try{
           int a= 10/2;
           System.out.println("heeloe");
            System.exit(0);    // 0 used in try
            System.out.println(a);

        }catch (Exception e){
            System.out.println("error");
            System.out.println(e.getMessage());
//            System.exit(1);  1 used in error

        }finally {
            System.out.println("ok");


        }


    }


}
