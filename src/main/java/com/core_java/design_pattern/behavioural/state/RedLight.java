package com.core_java.design_pattern.behavioural.state;

public class RedLight implements State{

    @Override
    public void handle() {
        System.out.println("Stop");
    }
}
