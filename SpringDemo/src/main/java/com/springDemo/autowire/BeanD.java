package com.springDemo.autowire;

import org.springframework.beans.factory.BeanNameAware;

public class BeanD implements BeanNameAware {

	private String name;

	public BeanD() {
		super();
		System.out.println("Constructor Called: public BeanD()");
	}

	public void setBeanName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
