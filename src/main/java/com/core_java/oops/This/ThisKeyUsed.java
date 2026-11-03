package com.core_java.oops.This;

public class ThisKeyUsed {



    public ThisKeyUsed objectReturn(){

        return this; // 5 return current obj
    }

    public void show(ThisKeyUsed thisKeyUsed){
        System.out.println(thisKeyUsed);
    }


    public ThisKeyUsed() {
        this(10);  // 3 call one constructor from another.
        System.out.println(" no arg constructor");
    }

    public ThisKeyUsed(int x) {
        System.out.println("parameter constructor");
    }

StringBuffer name ;
    int x;
    public  void show(int x){
        this.x = x; // 1 for instance variable
        this.print(); //2 for method calling (implicitly)

    }
    public void print(){
        System.out.println(x);

        show(this); // 4  pass current obj as argument

    }

    public static void main(String[] args) {

        ThisKeyUsed t = new ThisKeyUsed();
        t.show(10);
//        t.print();
    }




}
