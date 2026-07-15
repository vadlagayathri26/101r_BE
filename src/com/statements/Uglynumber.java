package com.statements;

public class Uglynumber {

	public static void main(String[] args) {
int num=30;
while(num%2==0) {
num=num/2;
}
while(num%3==0) {
	num =num/3;
}
while(num%5==0) {
	num=num/5;
}
if (num==1) {
	System.out.println("Ugly Number");
	}else {
		System.out.println(" Not Ugly number");
		
	}
	}

}
