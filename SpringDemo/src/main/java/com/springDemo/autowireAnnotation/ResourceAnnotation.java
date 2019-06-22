package com.springDemo.autowireAnnotation;

import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value = "prototype" )
@Lazy
public class ResourceAnnotation {

	public ResourceAnnotation() {
		System.out.println("ResourceAnnotation constructor");
	}
	private BeanD beanD ;

   // @Autowired //search by type and will throw expected single matching bean but found 3
	//have to use qualifier with Autowire
	
	@Resource //search byName by id ,  i.e bean id="uniqueBeanD"
	//rejects qualifier , so its different than autowire
	public void setUniqueBeanD(BeanD beanD) {
		this.beanD = beanD;
	}
	
	public BeanD getUniqueBeanD() {
		return beanD;
	}	
	
}
