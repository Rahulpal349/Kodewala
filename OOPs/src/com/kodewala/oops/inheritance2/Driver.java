package com.kodewala.oops.inheritance2;

class Account {
	public void OpenAccount(String userId, String email) // New features added to store Email Address

	{
		System.out.println("The user Id: " + userId);
	}
}

class SavingsAccount extends Account {
	@Override
	public void OpenAccount(String userId, String email) {
		System.out.println("The user Id: " + userId);
	}
}

class SrCitAccount extends SavingsAccount {
	@Override
	public void OpenAccount(String userId, String email) {
		System.out.println("The user Id: " + userId);
	}
}


class PensionAccount extends SrCitAccount {
	@Override
	public void OpenAccount(String userId, String email) {
		System.out.println("The user Id: " + userId);
	}
}

public class Driver {

	public static void main(String[] args) {

	}

}
