package com.core_java.SOLID;

public class Notification {
    private MessageService service;

    public Notification(MessageService service) {
        this.service = service;
    }

    void notifyUser() {
        service.sendMessage("Hello User!");
    }
}
