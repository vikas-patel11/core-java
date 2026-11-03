package com.core_java.oops.inheritance;


class A{
    public void show(){
        System.out.println("A show");
    }
    public Number print(){
        System.out.println("A print");
        return null;
    }
}


class B extends A{

    public void display(){
        System.out.println("B display");
    }

    @Override
    public Integer print(){
        System.out.println("B print");
        return null;
    }

}




public class InheritanceDemo {
    public static void main(String[] args) {

//        A a =new A(); // we can call only A methods
//
//        B b  =new B(); // we can call both A & B methods
//        b.print();

        A a = new B();
        a.print();


    }
}
