package com.kodewala.oops.inheritance3;

public class PushNotification extends Notification {

    private String deviceToken;
    private String appName;

    public PushNotification(String recipient, String message, String deviceToken, String appName) {

        super(recipient, message);
        this.deviceToken = deviceToken;
        this.appName = appName;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending push notification...");
        System.out.println("App Name: " + appName);
        System.out.println("Device Token: " + deviceToken);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("App Name: " + appName);
        System.out.println("Device Token: " + deviceToken);
    }
}
