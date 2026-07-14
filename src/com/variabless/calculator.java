package com.variabless;

public class calculator {

	public static void main(String[] args) {

		int num1=20;
		int num2=5;
		char op ='*';
		
	System.out.println("Enter First Number:"+num1);
	System.out.println("Enter Second Number :"+ num2);
		
	switch(op) 
		{
		case '+':
		System.out.println("Result:"+ (num1+num2));
		break;
		case '-':
			System.out.println("Result:"+(num1-num2));
			break;
		case '*':
			System.out.println("Result:"+(num1*num2));
			break;

		case '/':
			System.out.println("Result:"+(num1/num2));
			break;
		case '%':
			System.out.println("Result:"+(num1%num2));
			break;
default:
	System.out.println("Invalid Operator");
		}	
	}

}
