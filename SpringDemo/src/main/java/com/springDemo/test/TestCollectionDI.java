package com.springDemo.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collectonDI.QuestionWithList;
import org.apache.log4j.Logger;
  
public class TestCollectionDI {  
	static Logger log = Logger.getLogger(TestCollectionDI.class.getName());
public static void main(String[] args) { 
	
	 log.info("Spring Constructor examples");
	
      
      
    ApplicationContext context =   
    	    new ClassPathXmlApplicationContext("applicationContext.collectionDI.xml"); 
 
    QuestionWithList q=(QuestionWithList)context.getBean("que");  
    q.displayInfo();  

    
    ((ClassPathXmlApplicationContext)context).close();
    //to release connection to remove resource leak
    
    log.info("Exiting the program");
    
 }  

}

//https://stackoverflow.com/questions/243385/beanfactory-vs-applicationcontext
