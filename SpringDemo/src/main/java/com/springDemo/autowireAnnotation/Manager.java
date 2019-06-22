package com.springDemo.autowireAnnotation;

public class Manager implements Person {
	
	@Override
	public void greet() {
		System.out.println("greet from manager");
	}
	
}
