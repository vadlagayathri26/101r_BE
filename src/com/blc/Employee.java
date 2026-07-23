package com.blc;

public class Employee {

	private int empId;
	  private String empName;
	  private String designation;
	  private  double salary;
	  private int performanceRating;
	 public Employee( int empId, String empName,String designation,double salary,int performanceRating) {
		
		 this.empId= empId;
		 this.empName =empName;
		 this.designation=designation;
		 this.salary=salary;
		 this.performanceRating=performanceRating;
	 }

	 
	 public void setdesignation( String designation){
		 this.designation=designation;
	 }
	 
	 public void setsalary( double salary) {
		 this.salary=salary;
	 }
	 public int getempId() {
		 return empId;
	 }
	 
	public String getempName() {
		return empName;
	}

	public String getdesignation() {
		return designation;
	}
	public double getsalary() {
		return salary;
	}
	public int  getperformanceRating() {
		return performanceRating ;
	}

	public void promoteEmployee() {
		if(performanceRating>=4) {
			salary=salary+(salary*2/100);
			designation="developer";
			System.out.println("promote to next level");
		}else 
			System.out.println(" no promotion");

	}
}
