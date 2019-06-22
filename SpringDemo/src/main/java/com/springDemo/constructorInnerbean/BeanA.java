package com.springDemo.constructorInnerbean;

public class BeanA {  
	private int id;  
	private String name;  
	private BeanB beanB ;
	
	public BeanA() {System.out.println("def cons");}  
	  
	public BeanA(int id) {this.id = id;}  
	  
	public BeanA(String name) {  this.name = name;}  
	  
	public BeanA(int id, String name) {  
	    this.id = id;  
	    this.name = name;  
	}  
	  
	
	public BeanA(BeanB beanB) {
		System.out.println("In the Object constructor");
		this.beanB = beanB ;
		beanB.execute();
	}
	
	public void executeBeanBMethod() {
		this.beanB.execute();
	}
	public void show(){  
	    System.out.println(id+" "+name);  
	}  
  
}  