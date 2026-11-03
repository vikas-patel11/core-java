package com.core_java.design_pattern.structural.adapter;

public class Mp3Player implements MediaPlayer {
    @Override
    public void play(String file) {
        System.out.println("play mp3");
    }
}
