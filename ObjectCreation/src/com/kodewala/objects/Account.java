package com.kodewala.objects;

class AccountMgmt {
	public AccountMgmt() {
		System.out.println("Print AccountMgmt() Strating...");
	}
}

public class Account extends AccountMgmt {

	String accountNumber;
	// Instance Init Block --> this ill get executed whenever object is created.
	{
		System.out.println("Account IIB");
	}

	Account(String _accountNumber) {
		super(); // 1st line
		// call to init block ---> IIB --> 2nd line
		System.out.println("Account(String accountNumber)");
		this.accountNumber = _accountNumber;
  
	}
	static{
		System.out.println("Just for Testing");
	}
	void displayData() {
		System.out.println("Account Number: " + accountNumber);
	}

}
