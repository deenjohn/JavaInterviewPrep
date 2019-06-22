package com.springDemo.test;


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDemo.autowire.BeanA; 
  
public class TestAutowire {  
	static Logger log = Logger.getLogger(TestDependentObjectDI.class.getName());
	public static void main(String[] args) { 
		
		 log.info("Spring Constructor examples");
		
	      
	    ApplicationContext context =   
	    	    new ClassPathXmlApplicationContext("application.autowire.xml"); 
	   
	    BeanA beanA = context.getBean("beanA", BeanA.class);
	    
	    
	    ((ClassPathXmlApplicationContext)context).close();
	    //to release connection to remove resource leak
	    
	    log.info("Exiting the program");
	    
	 }  
}

//https://stackoverflow.com/questions/243385/beanfactory-vs-applicationcontext
