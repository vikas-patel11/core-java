package com.core_java.design_pattern.behavioural.observer;

public class Main {

    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel();

        Observer subscriber = new Subscriber();
        channel.subscribe(subscriber);
        channel.notify(subscriber);
    }
}
