package com.core_java.design_pattern.creational.singleton;

public class EagerSingleton {

    private final static EagerSingleton eagerSingletonObj =  new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getEagerSingletonObj(){

        return eagerSingletonObj;
    }
}
