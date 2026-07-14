package com.method;

public class Product {
	String productName;
	int productId;
	double  productPrice;
	public void ProductDetails() {
		System.out.println(" ProductDetails");
		System.out.println("ProductName:"+ productName);
		System.out.println(" ProductId:"+  productId);
		System.out.println(" ProductPrice :"+ productPrice);
	}

	public static void main(String[] args) {
Product p1=new Product();
p1.productName="Laptop";
p1.productId=101;
p1.productPrice =1000.00;
p1.ProductDetails() ;
	}

}
