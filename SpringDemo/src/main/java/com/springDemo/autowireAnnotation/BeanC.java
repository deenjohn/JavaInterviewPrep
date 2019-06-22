package com.springDemo.autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BeanC {

	//@Autowired //byType
	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}
  
	@Autowired  //byName
	 @Qualifier("action")
	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}
}
