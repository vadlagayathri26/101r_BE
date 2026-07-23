package com.blc;

import com.thiskeyword.Employee;

public class Employeemain {

	public static void main(String[] args) {
	Employee emp =new Employee(1001,"ravi","se",5000.0,5 );
		
		
		System.out.println("Before");
		System.out.println("Employee ID:"+emp.getempId());
		System.out.println("Employee name:"+emp.getempName());
	System.out.println("Current designation:"+ emp.getdesignation());
		System.out.println("Employee salary:"+ emp.getsalary());
		System.out.println("performanceRating:"+emp.getperformanceRating());
		
	
		emp.promoteEmployee();
		System.out.println("after");
		System.out.println("Employee ID:"+emp.getempId());
		System.out.println("Employee name:"+emp.getempName());
		System.out.println("Current designation:"+ emp.getdesignation());
		System.out.println("Employee salary:"+ emp.getsalary());
		System.out.println("performanceRating:"+emp.getperformanceRating());
		
		
	}
	

	}

