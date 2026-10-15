package com.kodewala.oops.inheritance.method.overriding;

public class Animal {
	String name;

	Animal(String name) {
		super();
		this.name = name;
	}

	public void makeSound() {
		System.out.println("Animal makes a sound");
	}

	public void displayetails() {
		System.out.println("Animal Name: " + name);
	}
}
