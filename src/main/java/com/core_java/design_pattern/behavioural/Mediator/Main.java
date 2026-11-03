package com.core_java.design_pattern.behavioural.Mediator;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("vikas");
        user1.send("hello");

        User user2 = new User("ram");
        user2.send("dept");
    }
}
