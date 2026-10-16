package com.kodewala.oops.inheritance3;

public class EmailNotification extends Notification{
	private String emailAddress;
    private String subject;

    public EmailNotification(String recipient, String message, String emailAddress, String subject) {

        super(recipient, message);
        this.emailAddress = emailAddress;
        this.subject = subject;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending email notification...");
        System.out.println("To: " + emailAddress);
        System.out.println("Subject: " + subject);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Subject: " + subject);
    }
}

