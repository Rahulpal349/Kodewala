package com.kodewala.constructor;

public class AccountHolderDriver {

	public static void main(String[] args) {

		AccountHolder account1 = new AccountHolder(2000, "984651", "Rahul", "9862545165");
		AccountHolder account2 = new AccountHolder(20000, "984651498", "Raj", "98625451165");
		System.out.println(account1.amount);
		System.out.println(account2.amount);

	}

}
