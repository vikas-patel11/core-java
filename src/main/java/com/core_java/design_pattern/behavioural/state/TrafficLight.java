package com.core_java.design_pattern.behavioural.state;

public class TrafficLight {
    private State state;

    public void setState(State s) {
        this.state = s;
    }

    public void change(){
        state.handle();
    }
}
