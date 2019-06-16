package com.code.composition;

import javax.persistence.Embeddable;

@Embeddable 
public class ManyAddress {

	public String street ;
	public String city ;
	public String zipcode;

	public ManyAddress() {}
	
	public ManyAddress(String street, String city ,String zipcode) {
		this.street = street;
		this.city = city;
		this.zipcode= zipcode;
		
	}
	
	
}
