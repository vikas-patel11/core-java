package com.core_java.design_pattern.behavioural.state;

public class GreenLight implements State{

    @Override
    public void handle() {
        System.out.println("Go");
    }
}
