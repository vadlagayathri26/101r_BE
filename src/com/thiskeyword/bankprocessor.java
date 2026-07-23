package com.thiskeyword;

public class bankprocessor {

	public static void main(String[] args) {
		bankAccount Acc =new bankAccount(101,"gayathri", 10000);

		 System.out.println("Current Balance: " + Acc.getbalance());
		
		 Acc.deposit(5000);
		
		 Acc.withdraw(3000);
		
		  System.out.println("Updated Balance: " + Acc.getbalance());
		
		
		
	}

}
