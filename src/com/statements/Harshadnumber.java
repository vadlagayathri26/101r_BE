package com.statements;

public class Harshadnumber {

	public static void main(String[] args) {
int num=30;
int sum=0;
int temp=num;
while (num%10==0) {
	int digit=num%10;
sum=sum+digit;
num=num/10;
}


if (temp==num) {
	System.out.println("Harshadnumber");
	
}else {
	System.out.println(" not Harshadnumber");
}

	}

}
