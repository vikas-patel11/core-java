package com.core_java.oops.inheritance;

 public class Animal1 {

    public void eat (){
        System.out.println("eating!");
    }
    public void run(){
        System.out.println("eating!");
    }
    
}

 class Dog{

     public void show (){

         System.out.println("Show!");
     }

    public static void main(String[] args) {


         Animal1 animal = new Animal1();
         animal.eat();
    }
}
