package com.springDemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springDemo.annotationDI.Student;  
  
public class TestAnnotationStudent {  
public static void main(String[] args) {  
	   
    ApplicationContext context =   
    	    new ClassPathXmlApplicationContext("application.annotation.xml");  
    Student student=(Student)context.getBean("student");  
    student.getName();
  }  
}

//https://stackoverflow.com/questions/243385/beanfactory-vs-applicationcontext
