package com.core_java.design_pattern.behavioural.observer;

public interface Subject {

    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void notify(Observer observer);


}
