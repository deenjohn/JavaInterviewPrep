package com.springDemo.autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BeanB {

	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}

	@Autowired  //byName
	 @Qualifier("main")
	public void beanGetter(BeanD beanD) {
		System.out.println("beanGetter");
		this.beanD = beanD;
	}
	
//	public void setBeanD(BeanD beanD) {
//		this.beanD = beanD;
//	}
}
