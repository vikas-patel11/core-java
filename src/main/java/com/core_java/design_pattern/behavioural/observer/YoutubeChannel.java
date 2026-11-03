package com.core_java.design_pattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observer> subscribers = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notify(Observer observer) {
        for (Observer subscriber : this.subscribers) {
            subscriber.notified();
        }


    }
}
