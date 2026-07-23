package com.thiskeyword;

public class bankAccount {
	
int accountNumber;
String accountHolder;
double balance;

public bankAccount(int accountNumber,String accountHolder,
double balance) {
	this.accountNumber=accountNumber;
	this.accountHolder=accountHolder;
	this.balance=balance;
}
	public int getaccountNumber() {
		return accountNumber;
	}
public String getaccountHolder() {
	return accountHolder;
}
public double getbalance() {
	return  balance;
}

public void setbalance(double balance) {
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
