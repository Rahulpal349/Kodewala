package com.kodewala.oops.inheritance;

class Employee {
	String name = "Rahul";Send us your ideaSend us your idea
	String address = "Kolkata";
	private String empCode = "HJFK1515";

	public void markIn(String empID) {
		System.out.println("Marking In " + empID);
	}
}

class Manager extends Employee {
	public void doSomething() {
		System.out.println(name);
		System.out.println(address);
		markIn(address);
	}
}

public class Organization {
	public static void main(String args[]) {
		Manager mg = new Manager();
		mg.doSomething();
	}
}
