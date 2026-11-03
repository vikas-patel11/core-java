package com.core_java.design_pattern.creational.singleton.break_singleton_pattern;

public class Samosa {

    static Samosa samosaObj;
    private Samosa(){
        // handle to not break
        if(samosaObj!=null){
            throw new RuntimeException("you trying to break singleton pattern!!");
        }

    }

    public static Samosa getSamosaObj(){

        if(samosaObj==null){
             samosaObj = new Samosa();
        }
        return samosaObj;

    }
}
