package com.kodewala.objects;

public class UserDriver {

	public static void main(String[] args) {
		
		System.out.println("UserDriver main()... START...");
		User u1 = new User("Rahul450", "Rahul@125", "9435679678");
		User u2 = new User("Raj450", "Rahul@1254", "9435688581");
		User u3 = new User("Raju450", "Rahul@1253", "9435685787");
		User u4 = new User("Rahu450", "Rahul@1252", "9423578780");
		
		System.out.println("Staring");
		
		u1.displayData();
		u2.displayData();
		u3.displayData();
		u4.displayData();
		
		System.out.println("UserDriver main()... END...");
	}

}
