package com.springDemo.autowire;

public class BeanB {

	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}

	//auto wire by name will select bean with id = beanD2
	public void setBeanD2(BeanD beanD) {
		System.out.println("Setter Called: public void setBeanD(BeanD beanD)");
		System.out.println("Injected Bean Name: " + beanD.getName());
		this.beanD = beanD;
	}

}
