package com.interview.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String args[]){  
		
		  Student s1=new Student(101,"Sonoo",23);  
		  Student s2=new Student(102,"Ravi",21);  
		  Student s3=new Student(103,"Hanumat",25);  
		 
		  Student s4 =new Student(101,"Sonoo",23); 
		  
		  ArrayList<Student> al=new ArrayList<Student>();  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		   
		  printAll(al);
		  
		  al.remove(s4);
		  
		  printAll(al);
		  
		 } 
	
	public static void printAll(ArrayList<Student> al) {
		Iterator<Student> itr=al.iterator();  
		  //traversing elements of ArrayList object  
		System.out.println("........................");
		
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  } 
	}
	  
	   
	
}
