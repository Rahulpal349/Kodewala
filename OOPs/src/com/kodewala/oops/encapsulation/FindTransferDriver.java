package com.kodewala.oops.encapsulation;

public class FindTransferDriver {

	public static void main(String[] args) {
		FundTransfer ft = new FundTransfer("Raaj", "984652", 10000);

		ft.doDisplay();
		System.out.println("Current Balance: " + ft.getBalance());
		ft.doCredit(1000);
		ft.doCredit(-100);
		ft.doDebit(-100);
	}

}
