package com.springDemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springDemo.constructorInnerbean.BeanA;

import org.apache.log4j.Logger;
  
public class TestConstructorInnerBean {  
	static Logger log = Logger.getLogger(TestConstructorInnerBean.class.getName());
public static void main(String[] args) { 
	
	 log.info("Spring Constructor examples");
      
      
    ApplicationContext context =   
    	    new ClassPathXmlApplicationContext("applicationContext.constructorInnerBean.xml"); 
    
    //<constructor-arg value="10" type="int"></constructor-arg>
    BeanA s1=(BeanA)context.getBean("emp1");  
    s1.show();  
    //10 null

    
    BeanA s2= context.getBean("emp2",BeanA.class);  
   // <constructor-arg value="10"></constructor-arg>  
    s2.show();
    //If you don't specify the type attribute in the constructor-arg element,
    //by default string type constructor will be invoked.
    
    BeanA s3=(BeanA)context.getBean("emp3");  
//    <constructor-arg value="10" type="int" ></constructor-arg>  
//	<constructor-arg value="deen"></constructor-arg>  
    s3.show();
    //10 deen
  
    BeanA s4=(BeanA)context.getBean("emp4");  
    System.out.println("calling s4");
    /*
    <constructor-arg index="1" value="deenjohn"></constructor-arg>  
	<constructor-arg index="0" value="10" ></constructor-arg> 
     */
    s4.show();
  //10 deenjohn
    
    
    //inner bean
    BeanA inner = context.getBean("innerBeanExample", BeanA.class);
    inner.executeBeanBMethod();
    
    ((ClassPathXmlApplicationContext)context).close();
    //to release connection to remove resource leak
    
    log.info("Exiting the program");
    
 }  

}

//https://stackoverflow.com/questions/243385/beanfactory-vs-applicationcontext
