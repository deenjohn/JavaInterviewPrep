package com.springDI.StaticFactoryMethod;

public class BeanB {
	
	private int age ;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setting age for beanB ");
		this.age = age;
	}
	
	public String greet() {
		return "greeting from beanB";
	}

}
