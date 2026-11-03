package com.core_java.design_pattern.creational.singleton;

public class LazySingleton {

    // 1. lazy 2. eager

    // lazy - not thread safe

    static LazySingleton lazySingletonObj;

    private LazySingleton() {

    }

    public static LazySingleton getLazySingletonObj() {

        if (lazySingletonObj == null) {
            lazySingletonObj = new LazySingleton();
        }

        return lazySingletonObj;
    }



    // lazy -  thread safe

    public static LazySingleton getLazyThreadSafeSingletonObj(){

        if(lazySingletonObj ==null){
            synchronized (LazySingleton.class){
                if(lazySingletonObj ==null){
                    lazySingletonObj = new LazySingleton();
                }
            }
        }
        return lazySingletonObj;




    }

}
