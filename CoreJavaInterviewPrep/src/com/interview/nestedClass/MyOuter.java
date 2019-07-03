package com.interview.nestedClass;

public class MyOuter {
	
	private int x = 7;
	public void makeInner() {
		MyInner in = new MyInner(); // make an inner instance
		in.seeOuter();
	}

	class MyInner {
		public void seeOuter() {
			System.out.println("Outer x is " + x); 
			//has access to outer class instance variables
		}
	}
	
	public static void main(String[] args) {
		
		MyOuter mo =new MyOuter();
		mo.makeInner();  //create inner class instance in this method
		
		MyOuter.MyInner inner = mo.new MyInner(); 
		//To instantiate it, you must use a reference to the outer class:
	}
}
