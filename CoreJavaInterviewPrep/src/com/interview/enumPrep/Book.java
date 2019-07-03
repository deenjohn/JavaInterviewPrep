package com.interview.enumPrep;

public class Book {
   
	//implictly static
	public enum CoffeeSize { 
		BIG, HUGE, OVERWHELMING 		
	}
	
	public enum BookGenre { 		
		HORROR("horror"),
		HUGE("huge"),
		OVERWHELMING("overwhelming");		
		private String name;
		private BookGenre(String name) {
			this.name = name ;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(Book.CoffeeSize.BIG);
		System.out.println(Book.BookGenre.HORROR);
	}
}




