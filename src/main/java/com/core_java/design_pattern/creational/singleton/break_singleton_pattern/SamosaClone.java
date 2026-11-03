package com.core_java.design_pattern.creational.singleton.break_singleton_pattern;

public class SamosaClone implements Cloneable {

    public static SamosaClone samosaCloneObj;
    private SamosaClone(){

    }

    public static SamosaClone getSamosaCloneObj(){

        if(samosaCloneObj ==null){
            samosaCloneObj = new SamosaClone();
        }
        return samosaCloneObj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // new object created
    }
}
