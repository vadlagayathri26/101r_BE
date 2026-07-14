package com.method;

public class car {
  String carMake;
  String carModel;
  String  manufacturingYear;
  
public void  addCarDetails() {
	System.out.println("CarMake:"+ carMake);
	System.out.println("CarModel:"+carModel);
	System.out.println("manufacturingYear:"+  manufacturingYear);
}
	public static void main(String[] args) {
	car c1=new car();
	c1.carMake= "Toyato";
	c1.carModel="Fortuner";
	c1. manufacturingYear="2025";
	
c1. addCarDetails();
	}

}
