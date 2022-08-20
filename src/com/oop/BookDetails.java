package com.oop;

import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EngineeringBook b1 = new EngineeringBook();
		
		System.out.println("Input the book details \n");
		System.out.println("Enter Book Number : ");
		int bookNo=scanner.nextInt();
		
		System.out.println("Enter Book Title : ");
		String bookTitle = scanner.nextLine();
		
		System.out.println("Enter Book Author : ");
		String author = scanner.nextLine();
		
		System.out.println("Enter Book Price : ");
		float price = scanner.nextFloat();
		
		System.out.println("Input category : ");
		String category = scanner.nextLine();
		
		b1.setBookNo(bookNo);b1.setAuthor(author);
		b1.setPrice(price);b1.setTitle(bookTitle);b1.setCategory(category);
		
		System.out.println("\n\n*****Book Details*****\n");
		System.out.println("Book No       : "+b1.getBookNo());
		System.out.println("Book Author   : "+b1.getAuthor());
		System.out.println("Book Price    : "+b1.getPrice());
		System.out.println("Book Title    : "+b1.getTitle());
		System.out.println("Book Category : "+b1.getCategory());
		
	}

}
