package com.statements;

public class Student {

	public static void main(String[] args) {
		int marks=87;
		System.out.println("Enter Student Marks:"+marks);
		
		if( (marks>=90)&&(marks<=100)) {
			
			 System.out.println("Grade : A");
        }
        else if(marks >= 80 && marks <= 89) {
            System.out.println("Grade : B");
        }
        else if(marks >= 70 && marks <= 79) {
            System.out.println("Grade : C");
        }
        else if(marks >= 60 && marks <= 69) {
            System.out.println("Grade : D");
        }
        else if(marks < 60 && marks >= 0) {
            System.out.println("Grade : Fail");
        }
        else {
            System.out.println("Invalid Marks");
        }
	}

}
