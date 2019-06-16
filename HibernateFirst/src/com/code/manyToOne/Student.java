package com.code.manyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity  
@Table(name= "student") 
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	private String enrol_id;
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL) //many students   may have same guide 
	@JoinColumn(name="guide_id")
	private Guide guide;
	
	public Student() {}
	public Student(String enrol_id,String name, Guide guide) {
		super();
		this.enrol_id = enrol_id;
		this.name = name;
		this.guide = guide;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", enrol_id=" + enrol_id + ", name=" + name + ", guide=" + guide + "]";
	}
	
	

}
