package com.kodewala.oops.inheritance.method.overriding;

public class AnimalDriver {

	public static void main(String[] args) {
		Cat cat = new Cat("Tommy");
		Dog dog = new Dog("Billu");
		Cow cow = new Cow("Gouri");
		System.out.println("=====DOG====");
		dog.displayetails();
		dog.makeSound();

		System.out.println("=====CAT====");
		cat.displayetails();
		cat.makeSound();

		System.out.println("=====COW====");
		cow.displayetails();
		cow.makeSound();

	}

}
