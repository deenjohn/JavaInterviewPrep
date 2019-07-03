package com.interview.nestedClass;

public class MyOuter1 {
	private int x = 7;

	// inner class definition
	class MyInner {
		public void seeOuter() {
			System.out.println("Outer x is " + x);
		}
	} // close inner class definition
}
