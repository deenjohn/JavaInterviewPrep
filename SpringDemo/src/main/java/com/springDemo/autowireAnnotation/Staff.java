package com.springDemo.autowireAnnotation;

public class Staff implements Person {
	
	public Staff() {
		
	}
	
	@Override
	public void greet() {
		System.out.println("greet from Staff");
	}
	
}
