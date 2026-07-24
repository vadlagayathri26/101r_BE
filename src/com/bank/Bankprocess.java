package com.bank;

public class Bankprocess {

	public static void main(String[] args) {
		BankAccount1 Acc =new BankAccount1(101,"gayathri", 10000);

		 System.out.println("Current Balance: " + Acc.getBalance());
		
		 Acc.deposit(5000);
		 Acc.withdraw(3000);
		
		  System.out.println("Updated Balance: " + Acc.getBalance());
		
	}

}
