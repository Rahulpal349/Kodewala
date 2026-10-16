package com.kodewala.oops.inheritance3;

public class NotificationDriver {

	public static void main(String[] args) {
		 EmailNotification email = new EmailNotification("Rahul","Your Java class is scheduled for tomorrow.","rahul@example.com","Java Course Update");

		        SMSNotification sms = new SMSNotification("Rahul","Your OTP is 123456.","9876543210");

		        PushNotification push = new PushNotification("Rahul","Your coding assignment is available.","TOKEN12345","Kodewala App");

		        System.out.println("===== EMAIL NOTIFICATION =====");
		        email.sendNotification();
		        email.displayDetails();

		        System.out.println("\n===== SMS NOTIFICATION =====");
		        sms.sendNotification();
		        sms.displayDetails();

		        System.out.println("\n===== PUSH NOTIFICATION =====");
		        push.sendNotification();
		        push.displayDetails();

		        }
}
