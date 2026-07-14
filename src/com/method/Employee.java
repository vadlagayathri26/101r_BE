package com.method;

public class Employee {
	String employeeName;
	int employeeId;
	double employeeSalary;
	public void displayDetails() {
		System.out.println("EmployeeName:"+employeeName);
		System.out.println("EmployeeId:"+ employeeId);
		System.out.println("EmployeeSalary:"+employeeSalary);
		
	}
	
	public static void main(String[] args) {
Employee e1=new Employee();
 e1. employeeName ="gayathri";
 e1.employeeId=202;
 e1.employeeSalary =200.00;
 e1.displayDetails();
	}

}
