package com.springDemo.test;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDemo.autowireAnnotation.BeanA;
import com.springDemo.autowireAnnotation.BeanB;
import com.springDemo.autowireAnnotation.BeanC;
import com.springDemo.autowireAnnotation.BeanD;
import com.springDemo.autowireAnnotation.Payroll;
import com.springDemo.autowireAnnotation.Person;
import com.springDemo.autowireAnnotation.ResourceAnnotation; 
  
public class TestAutowireByAnnotation {  
	
	//https://docs.spring.io/spring/docs/2.5.x/reference/beans.html#beans-autowired-annotation
	//https://stackoverflow.com/questions/24723403/spring-3-2-annotation-autowiring-with-multiple-constructors
	
	static Logger log = Logger.getLogger(TestDependentObjectDI.class.getName());
	public static void main(String[] args) throws InterruptedException { 
		
		 log.info("Spring Constructor examples");
		
	      
	    ApplicationContext context =   
	    	    new ClassPathXmlApplicationContext("applicationContext.autowireByAnnotation.xml"); 
	   
	    
	    
	    BeanA beanA = context.getBean("beanA", BeanA.class);
	    System.out.println(beanA.getBeanB().getBeanD());  //getbeanB and get its injected bean
	    System.out.println(beanA.getBeanB().getBeanD().getMyProperty());  //getbeanB and get its injected bean
	    
	    BeanC beanC = context.getBean("beanC", BeanC.class);
	    System.out.println(beanC.getBeanD());   //getbeanC and get its injected bean
	    System.out.println(beanC.getBeanD().getMyProperty());
	    
	    BeanB beanB = context.getBean("beanB", BeanB.class);
	    System.out.println(beanB.getBeanD());   //getbeanC and get its injected bean
	    
	    Payroll payroll = context.getBean("payroll", Payroll.class);
	    Person p = payroll.getPerson();
	    p.greet();
	    
	    Thread.sleep(3000); //to test lazy
	    
	    ResourceAnnotation resourceAnnotationBean1 = context.getBean("resourceAnnotation", ResourceAnnotation.class);
	    BeanD beanD1 = resourceAnnotationBean1.getUniqueBeanD();
	    System.out.println(beanD1.getMyProperty());    
	    
	    //test scope
	    ResourceAnnotation resourceAnnotationBean2 = context.getBean("resourceAnnotation", ResourceAnnotation.class);
	    BeanD beanD2 = resourceAnnotationBean2.getUniqueBeanD();
	    
	    System.out.println(beanD1 == beanD2);
	    
	    ((ClassPathXmlApplicationContext)context).close();
	    //to release connection to remove resource leak
	    
	    log.info("Exiting the program");
	    
	 }  
}

//https://stackoverflow.com/questions/243385/beanfactory-vs-applicationcontext
