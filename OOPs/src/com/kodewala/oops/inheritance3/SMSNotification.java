package com.kodewala.oops.inheritance3;

public class SMSNotification extends Notification {

    private String mobileNumber;

    public SMSNotification(String recipient, String message, String mobileNumber) {

        super(recipient, message);
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification...");
        System.out.println("Mobile Number: " + mobileNumber);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Mobile Number: " + mobileNumber);
    }
}
