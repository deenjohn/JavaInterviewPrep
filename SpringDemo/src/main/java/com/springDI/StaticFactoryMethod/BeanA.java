package com.springDI.StaticFactoryMethod;

import java.util.Calendar;


//https://stackoverflow.com/questions/18772490/
//what-is-the-difference-between-spring-factory-method-and-factory-bean

//https://spring.io/blog/2011/08/09/what-s-a-factorybean

//https://docs.spring.io/spring/docs/current/javadoc-api/org/
//springframework/beans/factory/FactoryBean.html

//factory-bean: It is used if factory method is non-static.

public class BeanA {
	
	private int age ;
    private Calendar calendar ;  //abstract class
    //https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html#getInstance()
    
    public BeanA(Calendar calendar) {
    	this.calendar = calendar ;
    }
    
	public int getAge() {
		return age;
	}
 

	 
	public void setAge(int age) {
		System.out.println("setting age ");
		this.age = age;
	}
	
	public String getYear() {
		return "year is : " + this.calendar.get(Calendar.YEAR);
	}
	

}
