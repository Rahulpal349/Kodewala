package com.kodewala.objects;

public class User {

	String userName;
	String userId;
	String mobileNumber;

	static {
		System.out.println("This is Common to all");
	}

	User(String _userName, String _userId, String _mobileNumber) {
		super();
		System.out.println("String userName, String userId, String mobileNumber");
		this.userName = _userName;
		this.userId = _userId;
		this.mobileNumber = _mobileNumber;
	}
	
	static {
		System.out.println("This is Common to all End");
	}

	void displayData() {
		System.out.println("User Name: " + userName);
		System.out.println("User ID: " + userId);
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("----------------------");
	}
}
