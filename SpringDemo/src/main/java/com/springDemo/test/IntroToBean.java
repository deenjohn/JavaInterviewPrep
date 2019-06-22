package com.springDemo.test;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.springDemo.Student;  
  
public class IntroToBean {  
public static void main(String[] args) {  
	/*
	 * using BeanFactory
	 * Resource resource=new ClassPathResource("applicationContext.xml");  
       BeanFactory factory=new XmlBeanFactory(resource);
	 */
	
	
	/*
	 * using ApplicationContext
	 the ClassPathXmlApplicationContext class is the implementation 
	 class of ApplicationContext interface
	 */
      
      
    ApplicationContext context =   
    	    new ClassPathXmlApplicationContext("applicationContext.xml");  
    Student student1=(Student)context.getBean("studentbean1");   
    
    Student student2=(Student)context.getBean("studentbean1");  
  
    
    System.out.println(student1 == student2);
    
    
    Student student3=(Student)context.getBean("bean1");  //by name 
    System.out.println(student3 == student1);
    
   }  
}

//https://stackoverflow.com/questions/243385/beanfactory-vs-applicationcontext
