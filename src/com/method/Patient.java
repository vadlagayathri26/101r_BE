package com.method;

public class Patient {
static String hospitalName;
String name;
int age ;
public void  printDetails() {
	System.out.println("Hospital Name : "+hospitalName);
	System.out.println("Patient Name:"+name);
	System.out.println("Patient Age: "+ age);
System.out.println("---------------");
}
	
	public static void main(String[] args) {
		Patient p1=new Patient ();
		hospitalName="City Care Hospital";
		p1.name="John Doe";
		p1.age= 46;
		Patient p2=new Patient ();
		p2.name="Emma Watson";
		p2.age= 30;
		p1.printDetails();
		p2.printDetails();
		
	}

}
