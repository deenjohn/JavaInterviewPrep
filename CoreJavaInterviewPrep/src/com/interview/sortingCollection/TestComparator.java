package com.interview.sortingCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

class Student {
	int rollno;
	String name;
	int age;
	static int newAge = 30 ;
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

public class TestComparator {
	
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Deen", 30));
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(107, "Ajay", 28));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name");
		System.out.println("............");
		
		Collections.sort(al, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.name.compareTo(s2.name);  
			}
			
		});
		printAll(al);

		System.out.println("............");
		
		System.out.println("Sorting by age");
		System.out.println("............");

		Collections.sort(al, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				
				return s1.age - s2.age;
			}
	
		});
		
		printAll(al);
		
		 //Sorting elements on the basis of age  
		
		System.out.println("Sorting by age");
		System.out.println("............");
		
	    Comparator<Student> cm2=Comparator.comparing(Student::getAge); 
	    Collections.sort(al,cm2);  
	    printAll(al);
	    
	    //Sorting elements on the basis of name  
	    System.out.println("Sorting by name");
		System.out.println("............");
	    Comparator<Student> cm1=Comparator.comparing(Student::getName);  
	     Collections.sort(al,cm1);  
	     printAll(al);
	   
	     System.out.println("............");
	     System.out.println("Sorting by age and rollno");
		 System.out.println("............");
		 
	     Comparator<Student> cmpInt =Comparator.comparingInt((Student s) -> s.age ).thenComparingInt((Student s) -> s.rollno);
	     Collections.sort(al,cmpInt);
	     printAll(al);
	}

	private static void printAll(ArrayList<Student> al) {
		ListIterator<Student> itr2 = al.listIterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();

			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}