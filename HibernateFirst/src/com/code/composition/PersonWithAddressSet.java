package com.code.composition;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;


@Entity  
@Table(name= "PersonWithManyAddress") 
public class PersonWithAddressSet {  
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int id;  
	
	private String name; 
	
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(
			name = "ManyAddress_Of_Person",
	        joinColumns=
	            @JoinColumn(name="Address_FK")
	    )
	private Set<ManyAddress> address = new HashSet<ManyAddress>() ;
	
	public Set<ManyAddress> getAddress() {
		return address;
	}
	public void setAddress(Set<ManyAddress> address) {
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
	
	public PersonWithAddressSet() {
		
		
	}
	
	public PersonWithAddressSet(String name, Set<ManyAddress> address) {
		super();
		
		this.name = name;
		this.address = address;
	}
	
	

}  
