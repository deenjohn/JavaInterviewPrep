package com.springDemo.test;


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springSettersDI.BeanA;  
  
public class TestSettersDI {  
	static Logger log = Logger.getLogger(TestDependentObjectDI.class.getName());
	public static void main(String[] args) { 
		
		 log.info("Spring Constructor examples");
		
		 /*
		  * You should note the difference in Beans.xml file defined in the constructor-based 
		  * injection and the setter-based injection. 
		  * The only difference is inside the <bean> 
		  * element where we have used <constructor-arg> tags for constructor-based injection 
		  * and <property> tags for setter-based injection.
		  * 
		  * 
		  */
	      
	    ApplicationContext context =   
	    	    new ClassPathXmlApplicationContext("applicationContext.SettersDI.xml"); 
	    BeanA beanA= context.getBean("beanA",BeanA.class);  
	    
	    System.out.println(beanA.getAge());
	    System.out.println(beanA.getBeanB());  // not set as it was not declared in xml 
	    
	    
	    ((ClassPathXmlApplicationContext)context).close();
	    //to release connection to remove resource leak
	    
	    log.info("Exiting the program");
	    
	 }  
}

//https://stackoverflow.com/questions/243385/beanfactory-vs-applicationcontext
