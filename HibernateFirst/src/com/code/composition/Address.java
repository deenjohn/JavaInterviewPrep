package com.code.composition;

import javax.persistence.Embeddable;

@Embeddable 
public class Address {

	public String street ;
	public String city ;
	public Zipcode zipcode = new Zipcode();

	public Address() {}
	
	public Address(String street, String city ,String zipcode) {
		this.street = street;
		this.city = city;
		this.zipcode.zip = zipcode;
		
	}
	
	
}
