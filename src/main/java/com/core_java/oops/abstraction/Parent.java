package com.core_java.oops.abstraction;


public abstract class Parent {

    public Parent(){
        System.out.println("Parent");
    }

    public void sound(){
        System.out.println("parent sound");
    }


    public static void walk(){
        System.out.println("parent walk");
    }


    abstract public void eat();
}

class Child extends Parent{

    public Child(){
        System.out.println("Child");
    }

    @Override
    public void eat() {
        String name = "demo";
        System.out.println("child eat");
    }

    public static void walk(){
        System.out.println("child walk");
    }

    @Override
    public void sound(){
        System.out.println("child sound");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.eat();
        c.sound();
        c.walk();
    }

}
