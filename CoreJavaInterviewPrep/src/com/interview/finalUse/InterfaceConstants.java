package com.interview.finalUse;

interface foo {
  
	int bar = 42 ;
	public void go() ;
}


public class InterfaceConstants implements foo {
  
	private static String name ;
	
	@Override
	public void go() {
		System.out.println("go");
		
	}
	public static void main(String[] args) {
		InterfaceConstants ic = new InterfaceConstants();
		System.out.println(ic.bar);
		//ic.bar = 43 ; //won't compile
	}
	
}
