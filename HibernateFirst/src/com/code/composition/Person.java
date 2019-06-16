package com.code.composition;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity  
@Table(name= "Person") 
public class Person {  
	
@Id	
@GeneratedValue(strategy = GenerationType.AUTO )
private int id;  
private String name; 

@Embedded
private Address address ;


public Person(String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  

//Could not locate getter for property named [com.code.hibernate.Employee#firstName]
//Should be same ie getFirstName() as in .hbm.xml file like  <property name="firstName">
//getFirstName1() won't work
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}  


}  
