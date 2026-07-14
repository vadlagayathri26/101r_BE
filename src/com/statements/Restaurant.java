package com.statements;

public class Restaurant {

	public static void main(String[] args) {
    int choice =2;
	System.out.println("********MENU***********");
	System.out.println("1.Pizza");
	System.out.println("1.Burger");
	System.out.println("1.sandwich");
    System.out.println(" 1.coffee");
    System.out.println("1.exit");
    System.out.println(" Enter Your Choice :"+choice);	
		
		switch( choice) {
		case 1:
			System.out.println(" you selected :pizza");
			System.out.println(" Price: 250");
			break;
		case 2:
			System.out.println(" you selected buger");
			System.out.println("price 150");
			break;
		case 3:
			System.out.println(" you selected sandwich");
			System.out.println(" price 120");
			break;
		case 4:
			System.out.println(" you selected coffee");
			System.out.println(" price 80");
			break;
		case 5:
		System.out.println("Exit");
        break;
			
			default:
				System.out.println("invalid choice");
                }
		
	}

}
