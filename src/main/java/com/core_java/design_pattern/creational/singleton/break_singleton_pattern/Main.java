package com.core_java.design_pattern.creational.singleton.break_singleton_pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {

        Samosa samosaObj1 = Samosa.getSamosaObj();
        System.out.println("obj1: " + samosaObj1.hashCode());

        Samosa samosaObj2 = Samosa.getSamosaObj();
        System.out.println("obj2: "+samosaObj2.hashCode());

        //

        /*Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa obj3 = constructor.newInstance();
        System.out.println("obj3: "+obj3.hashCode());*/

        SamosaClone samosaCloneObj = SamosaClone.getSamosaCloneObj();
        System.out.println("obj 1 : "+samosaCloneObj.hashCode());

        SamosaClone samosaCloneObj1 = (SamosaClone) samosaCloneObj.clone();
        System.out.println("obj 2 : "+samosaCloneObj1.hashCode());

       samosaCloneObj.clone();


    }
}
