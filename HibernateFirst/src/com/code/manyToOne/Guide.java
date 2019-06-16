package com.code.manyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity  
@Table(name= "guide") 

public class Guide {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	private String staffid;

	private String name;
	
	 @OneToOne(cascade=CascadeType.ALL)  
	  private Student student;  
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Guide() {
		
	}
	
	public String getStaffid() {
		return staffid +"from new Guide";
	}
	public void setStaffid(String staffid) {
		this.staffid = staffid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Guide(String staffid, String name) {
		super();
		this.staffid = staffid;
		this.name = name;
	}
	

	
	
}
