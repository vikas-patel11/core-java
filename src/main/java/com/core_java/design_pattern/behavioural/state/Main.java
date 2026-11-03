package com.core_java.design_pattern.behavioural.state;

public class Main {

    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setState(new GreenLight());
        trafficLight.change();

        trafficLight.setState(new RedLight());
        trafficLight.change();
    }
}
