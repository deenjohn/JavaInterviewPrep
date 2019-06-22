package com.springDemo.autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Payroll {

    private Person person;

    

	@Autowired
    public Payroll(@Qualifier("staff") Person person){
          this.person = person;
    }
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}