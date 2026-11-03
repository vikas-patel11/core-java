package com.core_java.design_pattern.behavioural.Mediator;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public void send(String msg){
        ChatRoom.showMsg(name,msg);
    }
}
