package com.core_java.oops.Polymorphism;


class XYZ{

    Object show() throws Exception{

        System.out.println("XYZ : Show!");
        return null;
    }
}



public class Test extends XYZ{

    @Override
    public String show() throws RuntimeException{

        System.out.println("Test : Show!");
        return null;
    }

    public static void main(String[] args) throws Exception {

        XYZ test = new Test();
        test.show();

    }
}

// 1. Return Type  -
// 2. Access modifier - subclass more accessible compares to super class
//3. Exception - if Super class method not throws Exception then subclass method can throws only Runtime exception
        //   if Super class method throws Exception then subclass method can throws only same level of exception
