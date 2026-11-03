package com.core_java.design_pattern.structural.facade;

public class HomeTheaterFacade {

    private TV tv;
    private SoundSystem soundSystem ;
    private DVDPlayer dvdPlayer;


    public HomeTheaterFacade() {
        tv = new TV();
        soundSystem = new SoundSystem();
        dvdPlayer = new DVDPlayer();
    }

    public void watchMovie() {
        tv.on();
        soundSystem.on();
        dvdPlayer.on();
        dvdPlayer.playMovie();
    }
}
