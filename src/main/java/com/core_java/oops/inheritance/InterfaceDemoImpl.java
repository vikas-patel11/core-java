package com.core_java.oops.inheritance;

public class InterfaceDemoImpl extends DemoClass implements InterfaceDemo{
    @Override
    public String demo() {
        return "";
    }

    public static void main(String[] args) {
        InterfaceDemoImpl interfaceDemo =new InterfaceDemoImpl();
        interfaceDemo.demo();
    }

}

