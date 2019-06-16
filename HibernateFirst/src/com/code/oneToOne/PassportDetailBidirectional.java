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
@Table(name= "PassportBidirectional") 
public class PassportDetailBidirectional {

	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long passport_id ;
	
	private String passport_no ;
	
	//bidirectional mapping
	@OneToOne(mappedBy = "pd",cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id")  //creates a foreign key in passport detail //foreign key (person_id) references Person (id)
	private PersonBidirectional person ;
	
	public PersonBidirectional getPerson() {
		return person;
	}
	public void setPerson(PersonBidirectional p1) {
		this.person = p1;
	}
	
	//above code is for bidirectional
	
	public long getPassport_id() {
		return passport_id;
	}
	public void setPassport_id(long passport_id) {
		this.passport_id = passport_id;
	}
	public String getPassport_no() {
		return passport_no;
	}
	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}
	
	public PassportDetailBidirectional() {
		
	}
	public PassportDetailBidirectional(String passport_no) {
		super();
		
		this.passport_no = passport_no;
	}
	
	@Override
	public String toString() {
		return "PassportDetail [passport_id=" + passport_id + ", passport_no=" + passport_no + "]";
	}

	
}
