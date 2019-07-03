package com.interview.nestedClass;

class TestOuter1 {
	static int data = 30;

	static class InnerClass {
		void msg() {
			System.out.println("data is " + data);
		}		
		public static void greet() {
			System.out.println("greet");
		}
	}

	public static void main(String args[]) {
		TestOuter1.InnerClass obj=new TestOuter1.InnerClass();  
		 obj.msg();
		 
		 TestOuter1 test = new TestOuter1();
		 
	}
}