package com.core_java.SOLID;

public class Main {
    public static void main(String[] args) {

        MessageService messageService = new EmailService();
        
        messageService.sendMessage("vikas");

        Notification notification =new Notification(messageService);
        System.out.println(notification);
    }
}
