package com.core_java.oops.This;


public class ThisDemo {


    int id;

    public ThisDemo() {
        System.out.println("hello");
    }

    public void demo(ThisDemo thisDemo){
        System.out.println("this demo");
    }

    public ThisDemo(ThisDemo thisDemo) {
        System.out.println("demoCons");
    }

    public  ThisDemo demoReturn(ThisDemo thisDemo){
        System.out.println("return current object");
        return this;
    }

    public ThisDemo(int id) {

        //3. this() can be used to invoke current class constructor.
        this();

        // 1. this can be used to refer current class instance variable.
        this.id=id;
        System.out.println("demo");

        // 2. this can be used to invoke current class method (implicitly).
        this.show();

        // 4. this can be passed as an argument in the method call.
        this.demo(this);

        // 5. this can be passed as argument in the constructor call.
        ThisDemo thisDemo1 =new ThisDemo(this);

        // 6. this can be used to return the current class instance from the method.
        thisDemo1.demoReturn(this);

    }

    public void show(){
        System.out.println("show");
    }


    public static void main(String[] args) {

        ThisDemo thisDemo =new ThisDemo(10);


    }
}
