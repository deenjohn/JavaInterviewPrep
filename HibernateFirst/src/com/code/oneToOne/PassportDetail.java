package com.code.oneToOne;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "PassportDetail") 
public class PassportDetail {

	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long passport_id ;
	
	private String passport_no ;
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
	
	public PassportDetail() {
		
	}
	public PassportDetail(String passport_no) {
		super();
		
		this.passport_no = passport_no;
	}
	
	@Override
	public String toString() {
		return "PassportDetail [passport_id=" + passport_id + ", passport_no=" + passport_no + "]";
	}

	
}
