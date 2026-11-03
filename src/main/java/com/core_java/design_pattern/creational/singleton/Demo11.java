package com.core_java.design_pattern.creational.singleton;

public class Demo11 {

    private static Demo11 demo11;

    private Demo11() {
    }

    static Demo11 getObject(){

        if(demo11 == null){
            demo11 = new Demo11();

        }
        return demo11;
    }

    public static void main(String[] args) {

        Demo11 object = getObject();
        System.out.println(object.getClass());

        Demo11 object1 = getObject();
        System.out.println(object1.getClass());
    }

}
