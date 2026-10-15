package com.kodewala.oops.inheritance.method.overriding;

public class Cat extends Animal {

	Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Cat Says: Meow! Meow!");
	}

}
