package com.blc;

public class BankAccount {
	int accountNumber;
	String accountHolder;
	double balance;

	public BankAccount(int accountNumber,String accountHolder,
	double balance) {
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
		public int getAccountNumber() {
			return accountNumber;
		}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return  balance;
	}

	public void setBalance(double balance) {
		this.balance=balance;
	}

	public void deposit(double amount) {
	    balance = balance + amount;
	    System.out.println("Deposited Amount: " + amount);
	}

	public void withdraw(double amount) {
	    if (balance >= amount) {
	        balance = balance - amount;
	        System.out.println("Withdrawn Amount: " + amount);
	    } else {
	        System.out.println("Insufficient balance");
	    }
	}
}
