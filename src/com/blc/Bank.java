package com.blc;

public class Bank {

	public static void main(String[] args) {
		BankAccount Acc =new BankAccount(101,"gayathri", 10000);

		 System.out.println("Current Balance: " + Acc.getBalance());
		
		 Acc.deposit(5000);
		 Acc.withdraw(3000);
		
		  System.out.println("Updated Balance: " + Acc.getBalance());
		
	
	}
	}

