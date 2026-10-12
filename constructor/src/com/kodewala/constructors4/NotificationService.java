package com.kodewala.constructors4;

public class NotificationService {

	public void sendNotification(String _type, String _dest) {
		System.out.println("NotificationService.sendNotification() Start: "+ _type);
		if(_type.equalsIgnoreCase("sms")) {
			sendSMS();
		} else if(_type.equalsIgnoreCase("email")){
			sendEmail();
		} else {
			sendWhatsapp();
		}
		System.out.println("NotificationService.sendNotification() END...");
	}

	private void sendSMS() {
		System.out.println("NotificationService.sendNotification() Start");

		System.out.println("NotificationService.sendNotification() END...");
	}

	private void sendEmail() {
		System.out.println("NotificationService.sendNotification() Start");

		System.out.println("NotificationService.sendNotification() END...");
	}

	private void sendWhatsapp() {
		System.out.println("NotificationService.sendNotification() Start");

		System.out.println("NotificationService.sendNotification() END...");
	}
}
