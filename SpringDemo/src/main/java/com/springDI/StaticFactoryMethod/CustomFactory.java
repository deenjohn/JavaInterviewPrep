package com.springDI.StaticFactoryMethod;

public class CustomFactory {
	
	private CustomFactory() {
		System.out.println("Instantiating Factory");
	}
	
	public BeanB getBeanBInstance() {
		System.out.println("Returning Instance of BeanB");
		return new BeanB();
	}
}
