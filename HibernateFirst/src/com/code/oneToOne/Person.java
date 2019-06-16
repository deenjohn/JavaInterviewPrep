package com.code.oneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  
@Table(name= "Person") 
public class Person {  
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;  
	private String name; 
	private String email; 
	
	//whoever owns the foreign key column gets the @JoinColumn annotation.
	
	//parent class
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passport_id") //alter table Person add constraint FKr4dh6e6o78s1edmm714nhirkp foreign key (passport_id) references PassportDetail (passport_id)
	private PassportDetail pd ;
	
	public Person(String name,String email,PassportDetail pd) {
		super();
		this.name = name;
		this.email = email;
		this.pd = pd;
	}
	
	public Person() {
	
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getId() {  
	    return id;  
	}  
	public void setId(long id) {  
	    this.id = id;  
	}  
	
	
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}

	public PassportDetail getPd() {
		return pd;
	}

	public void setPd(PassportDetail pd) {
		this.pd = pd;
	}

	

}  
