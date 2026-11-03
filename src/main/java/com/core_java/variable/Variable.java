package com.core_java.variable;

public class Variable {

    private static int b = 20;
    public int a = 10;

    public static void main(String[] args) {

        int c = 50;
        b = 600;

        System.out.println("local :" + c);

        Variable v1 = new Variable();
        v1.a = 400;
        System.out.println("instance1 :" + v1.a);
        System.out.println("static :" + b);
        System.out.println("static :" + Variable.b);


        System.out.println("instance1-1 :" + v1.a);

        Variable v2 = new Variable();
        System.out.println("instance: " + v2.a);
        System.out.println("static2 :" + b);
        System.out.println("static 2:" + Variable.b);

    }


    void show() {

        System.out.println(a);
    }
}
