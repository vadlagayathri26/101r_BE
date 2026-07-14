package com.method;

public class Book {
	String bookTitle;
	String author;
	String isbn;
	public void BookDetails() {
		System.out.println("BookTitle:"+bookTitle);
		System.out.println("Author:"+author);
		System.out.println("Isbn:"+isbn);
		
	}

	public static void main(String[] args) {

		Book b1=new Book();
		b1. bookTitle="The Alchemist";
		b1.author="Paulo Coelho";
		b1.isbn="9780061122415";
		b1.BookDetails();
	}

}
