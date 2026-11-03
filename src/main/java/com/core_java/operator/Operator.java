package com.core_java.operator;

public class Operator {

    int a = 5;
    int b = 2;
    int c = 10;

    String x = "vik";
    String y = "vik";
    String z = "vik";


    public static void main(String[] args) {

        Operator o = new Operator();
        if (o.a < o.b & o.a < o.c) {

            System.out.println("good");
        }
        if (o.x.equals( o.y) & o.x.equals( o.z)) {

            System.out.println("good");
        }


    }
}
