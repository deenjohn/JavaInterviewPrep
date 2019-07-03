package com.interview.nestedClass;

interface Message {
	String greet();
}

public class Anonymous {
	
	public void displayMessage(Message m) {
		
		System.out.println(m.greet() + ", This is an example of anonymous inner class as an argument");
	}

	public static void main(String args[]) {

		Anonymous obj = new Anonymous();

		obj.displayMessage(new Message() {
			public String greet() {
				return "Hello";
			}
		});
	}
}
