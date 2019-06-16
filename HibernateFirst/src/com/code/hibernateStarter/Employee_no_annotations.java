package com.code.hibernateStarter;

public class Employee_no_annotations {  
private int id;  
private String firstName,lastName; 

  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  

//Could not locate getter for property named [com.code.hibernate.Employee#firstName]
//Should be same ie getFirstName() as in .hbm.xml file like  <property name="firstName">
//getFirstName1() won't work
public String getFirstName() {  
    return firstName;  
}  
public void setFirstName(String firstName) {  
    this.firstName = firstName;  
}  
public String getLastName() {  
    return lastName;  
}  
public void setLastName(String lastName) {  
    this.lastName = lastName;  
}

@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}  


}  
