package com.core_java.design_pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Samosa {

    // its eager way
//    private static Samosa samosa = new Samosa();

    private static volatile Samosa samosa;
    private Samosa() {
        System.out.println("samosa");
    }

    // its lazy way
    public static Samosa getSamosaObject() {

        if (samosa == null) {  // 1st check (no lock)
            synchronized (Samosa.class) {
                if (samosa == null) {  // 2nd check (with lock)
                    samosa = new Samosa();
                }
            }
        }

        return samosa;
    }



    public static void main(String[] args) throws Exception {
        Samosa samosaObject = Samosa.getSamosaObject();
        System.out.println(samosaObject.hashCode());
        Samosa samosaObject1 = Samosa.getSamosaObject();
        System.out.println(samosaObject1.hashCode());
        Samosa samosaObject2 = Samosa.getSamosaObject();
        System.out.println(samosaObject2.hashCode());


        Constructor<Samosa> declaredConstructor = Samosa.class.getDeclaredConstructor();
        Samosa samosa1 = declaredConstructor.newInstance();
        System.out.println(samosa1.hashCode());


    }
}




