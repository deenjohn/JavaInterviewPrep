package com.springDemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDI.StaticFactoryMethod.BeanA;
import com.springDI.StaticFactoryMethod.BeanB;

import org.apache.log4j.Logger;
  
public class TestDependentObjectDI {  
	static Logger log = Logger.getLogger(TestDependentObjectDI.class.getName());
public static void main(String[] args) { 
	
	 log.info("Spring Constructor examples");
	
      
    ApplicationContext context =   
    	    new ClassPathXmlApplicationContext("applicationContext.staticFactory.xml"); 
    BeanA beanA=context.getBean("beanA",BeanA.class);  
    System.out.println(beanA.getYear()); 

    
    BeanB beanb=context.getBean("beanB",BeanB.class);  
    System.out.println(beanb.greet()); 

   
    ((ClassPathXmlApplicationContext)context).close();
    //to release connection to remove resource leak
    
    log.info("Exiting the program");
    
 }  

}

//https://stackoverflow.com/questions/243385/beanfactory-vs-applicationcontext
