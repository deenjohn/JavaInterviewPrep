package com.interview.generics.lowerBoundedWildcards;

import java.util.ArrayList;
import java.util.List;


class Gift {
	
}

class Book extends Gift {
	String title;
    
	Book(){
		
	}
	Book(String title) {
		this.title = title;
	}

	public String toString() {
		return title;
	}
}

class Phone extends Gift{}

public class Courier {
	
	//wrapGift will accept list of any unknown type
	public static void wrapGift(List<?> list) { 			
		//list.add(list.get(0));  //wont work
		
		for (Object item : list) {
			System.out.println("GiftWrap - " + item);
		}
	}
	
	   //only accept Gift types
		public static void wrapGift2(List<?extends Gift> list) { 			
			//list.add(list.get(0));  //wont work
			
			for (Gift item : list) {
				System.out.println("GiftWrap - " + item);
			}
		}

	public static void main(String args[]) {
		
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("Oracle"));
		bookList.add(new Book("Java"));
		//bookList.add(bookList.get(0));
		wrapGift(bookList);
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("Paul");
		stringList.add("Shreya");
		wrapGift(stringList);
		
		List<Book> bookList2 = new ArrayList<Book>();
		bookList2.add(new Book("Oracle"));
		bookList2.add(new Book("Java"));
		wrapGift2(bookList2); 
		
		List<Phone> bookList3 = new ArrayList<Phone>();
		bookList3.add(new Phone());
		bookList3.add(new Phone());
		wrapGift2(bookList3); 
		
		//can add Gift and its subclasses 
		List<? super Gift> list = new ArrayList<Gift>();
		list.add(new Gift());
		list.add(new Book());
		list.add(new Phone()); 
		
		//list.add(new Object());  wont compile
		
		for (Object obj : list) System.out.println(obj); 
		//Elements are read as instance Object, superclass of Gift
		
	}
}


