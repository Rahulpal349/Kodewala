package com.kodewala.oops.inheritance.method.overriding;

public class Cow extends Animal {

	Cow(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Cow Says: Hamma! Humma!");
	}
}
