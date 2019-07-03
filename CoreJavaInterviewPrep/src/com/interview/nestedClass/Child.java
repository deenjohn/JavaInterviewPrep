package com.interview.nestedClass;

class Parent {
	Parent(String s) {
	}

	Parent() {
	}
}

public class Child extends Parent {
	
	Child() {
	}

	Child(String s) {
		super(s);
	}

	void zoo() {
		// insert code here
		Parent f1 = new Child() { };
		Child f2 =  new Child()  {
			          String s;
			          public void greet() {
			        	  System.out.println("greet");
			          }
		          };
	   //System.out.println(f2.greet()); //won't work
		
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.zoo();
	}
}


