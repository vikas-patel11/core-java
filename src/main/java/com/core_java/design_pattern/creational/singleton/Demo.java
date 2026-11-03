package com.core_java.design_pattern.creational.singleton;

public class Demo {
    public static void main(String[] args) {

//        System.out.println(LazySingleton.getLazySingletonObj().hashCode());
//        System.out.println(LazySingleton.getLazySingletonObj().hashCode());

        System.out.println(LazySingleton.getLazyThreadSafeSingletonObj().hashCode());
        System.out.println(LazySingleton.getLazyThreadSafeSingletonObj().hashCode());

        System.out.println(EagerSingleton.getEagerSingletonObj().hashCode());
        System.out.println(EagerSingleton.getEagerSingletonObj().hashCode());



    }
}
