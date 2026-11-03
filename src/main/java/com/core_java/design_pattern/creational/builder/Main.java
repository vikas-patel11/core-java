package com.core_java.design_pattern.creational.builder;

public class Main {

    public static void main(String[] args) {

        User.UserBuilder userBuilder = new User.UserBuilder();
        User user1 = userBuilder.setName("vikas").build();
        System.out.println(user1);
        User user2 = userBuilder.setName("tekno").setAge(25).setEmail("demo@gmail.com").build();
        System.out.println(user2);
    }
}
