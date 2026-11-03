package com.core_java.design_pattern.structural.adapter;

public class PlayerAdapter implements MediaPlayer{

    MP4Player mp4Player = new MP4Player();

    @Override
    public void play(String file) {
        mp4Player.playVlc(file);
    }
}
