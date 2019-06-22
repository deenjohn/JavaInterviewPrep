package com.springDemo.autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {


	private BeanB beanB;
	private BeanC beanC;

	@Autowired(required=false)  // default @Autowired is true
	public BeanA(BeanB beanB) {
		super();
		System.out.println("Constructor called: BeanA(BeanB beanB)");
		this.beanB = beanB;
	}
	
	@Autowired(required=false) //The required attribute indicates that the property is not required for autowiring purposes, simply skipping it if it cannot be autowired
	public BeanA(BeanB beanB, BeanC beanC) {
		super();
		System.out.println("Constructor called: BeanA(BeanB beanB, BeanC beanC)");
		this.beanB = beanB;
		this.beanC = beanC;
	}

	public BeanB getBeanB() {
		return beanB;
	}

	public BeanC getBeanC() {
		return beanC;
	}

}
