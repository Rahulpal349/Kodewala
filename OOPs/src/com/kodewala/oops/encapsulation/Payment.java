package com.kodewala.oops.encapsulation;

public class Payment {

	private int balance;
	Payment(int _balance) {
		super();
		this.balance = _balance;
	}
	//setter
	public void doDebit(int _amount) {
		if (_amount<balance) {
			//modifying the data
			balance = balance -_amount;
			System.out.println("Amount Debited: "+_amount);
		}
	}
		public void doCredit(int _amount) {
			if(_amount>0) {
				//Modifying the data
				balance = balance +_amount;
				System.out.println("Amount Credited: "+_amount);
			}
		}
		public int getBalance() {
			return balance;
		}
//		void doDisplay() {
//			
//		}
	}
	

