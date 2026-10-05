package com.kodewala.constructor1;

public class AccountDriver {

	public static void main(String[] args) {
		
		Account acc1 = new Account(); //calling a constructor;
		Account acc2 = new Account(64, "LUHAR");
		
		System.out.println(acc1.name + " and " +acc1.amount);
		System.out.println(acc2.amount + " and " +acc2.name);

	}

}
