package com.interview.nestedClass;

class MyOuter3 {
	
	private int x = 7;

	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter();
	}

	class MyInner {
		public void seeOuter() {
			System.out.println("Outer x is " + x);
			System.out.println("Inner class ref is " + this);
			
			//To reference the "outer this" (the outer class instance) from within the inner
			System.out.println("Outer class ref is " + MyOuter3.this);
		}
	}

	public static void main(String[] args) {
		MyOuter.MyInner inner = new MyOuter().new MyInner();
		inner.seeOuter();
	}
}
