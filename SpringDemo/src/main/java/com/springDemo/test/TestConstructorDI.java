package com.springDemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springConstructorDI.Employee;
import org.apache.log4j.Logger;
  
public class TestConstructorDI {  
	static Logger log = Logger.getLogger(TestConstructorDI.class.getName());
public static void main(String[] args) { 
	
	 log.info("Spring Constructor examples");
	
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
    	    new ClassPathXmlApplicationContext("applicationContext.constructorDI.xml"); 
    //<constructor-arg value="10" type="int"></constructor-arg>
    Employee s1=(Employee)context.getBean("emp1");  
    s1.show();  
    //10 null

    
    Employee s2=(Employee)context.getBean("emp2");  
   // <constructor-arg value="10"></constructor-arg>  
    s2.show();
    //If you don't specify the type attribute in the constructor-arg element,
    //by default string type constructor will be invoked.
    
    Employee s3=(Employee)context.getBean("emp3");  
//    <constructor-arg value="10" type="int" ></constructor-arg>  
//	<constructor-arg value="deen"></constructor-arg>  
    s3.show();
    //10 deen
    
    ((ClassPathXmlApplicationContext)context).close();
    //to release connection to remove resource leak
    
    log.info("Exiting the program");
    
 }  

}

//https://stackoverflow.com/questions/243385/beanfactory-vs-applicationcontext
