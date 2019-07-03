package com.interview.generics.upperBoundedWildcards;

import java.util.ArrayList;
import java.util.List;


class Gift {
}

class Phone extends Gift {
}
class Book extends Gift {
	String title;

	Book(String title) {
		this.title = title;
	}

	public String toString() {
		return title;
	}
}

class Courier {
	
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
		
		
		//For collections defined using upper-bounded wildcards, you
		//can’t add any objects. You can iterate and read values 
		//from such collections
		
		//can add gift or its superclass 
		List<? extends Gift> list1 = new ArrayList<Gift>();
		//list1.add(new Gift()); //wont work
				 
		
	}
}


