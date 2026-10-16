package com.kodewala.oops.inheritance3;

public class Notification {

    private String recipient;
    private String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending a general notification...");
    }

    public void displayDetails() {
        System.out.println("Recipient: " + recipient);
        System.out.println("Message: " + message);
    }
}
