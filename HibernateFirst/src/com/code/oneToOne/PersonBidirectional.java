package com.code.oneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//https://www.baeldung.com/jpa-one-to-one

@Entity  
@Table(name= "PersonBidirectional") 
public class PersonBidirectional {  
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;  
	private String name; 
	private String email; 
	
	//whoever owns the foreign key column gets the @JoinColumn annotation.
	
	//parent class
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="passport_id", unique=true, nullable=false, updatable=false ,
	     foreignKey = @ForeignKey(name = "PASSPORT_FK") 
	)

	private PassportDetailBidirectional pd ;
	
	public void setPd(PassportDetailBidirectional pd) {
		this.pd = pd;
	}

	public PersonBidirectional(String name,String email,PassportDetailBidirectional pd2) {
		super();
		this.name = name;
		this.email = email;
		this.pd = pd2;
	}
	
	public PersonBidirectional() {
	
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	
	
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}

	public PassportDetailBidirectional getPd() {
		return pd;
	}

	public void PassportDetailSharePK(PassportDetailBidirectional pd) {
		this.pd = pd;
	}

	

}  
