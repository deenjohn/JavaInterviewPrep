package com.interview.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

abstract class Task implements Comparable<Task> {
	protected Task() {
	}

	public boolean equals(Object o) {
		System.out.println("equals called on object : "+this +" isEqual? "+o);
		if (o instanceof Task) {
			return toString().equals(o.toString());
		} else
			return false;
	}

	public int compareTo(Task t) {
		System.out.println("compareTo called : "+t);
		return toString().compareTo(t.toString());
	}

	public int hashCode() {
		System.out.println("hashCode called");
		return toString().hashCode();
	}

	public abstract String toString();
}

final class CodingTask extends Task {
	private final String spec;

	public CodingTask(String spec) {
		this.spec = spec;
	}

	public String getSpec() {
		return spec;
	}

	public String toString() {
		return "code " + spec;
	}
}

final class PhoneTask extends Task {
	private final String name;
	private final String number;

	public PhoneTask(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String toString() {
		return "phone " + name;
	}
}

class EmptyTask extends Task {
	public EmptyTask() {
	}

	public String toString() {
		return "";
	}
}

public class TestAddingRemoving {

	public static void main(String[] args) {

		//phone tasks
		PhoneTask mikePhone = new PhoneTask("Mike", "987 6543");
		PhoneTask paulPhone = new PhoneTask("Paul", "123 4567");
		
		//coding tasks
		CodingTask databaseCode = new CodingTask("db");
		CodingTask interfaceCode = new CodingTask("gui");
		CodingTask logicCode = new CodingTask("logic");
		
		//4 types of collection
		Collection<PhoneTask> phoneTasks = new ArrayList<PhoneTask>();
		Collection<CodingTask> codingTasks = new ArrayList<CodingTask>();
		Collection<Task> mondayTasks = new ArrayList<Task>();
		Collection<Task> tuesdayTasks = new ArrayList<Task>();
		
		//	addAll(Collection<? super T> c, T... elements)
		
		Collections.addAll(phoneTasks, mikePhone, paulPhone);
		Collections.addAll(codingTasks, databaseCode, interfaceCode, logicCode);
		Collections.addAll(mondayTasks, logicCode, mikePhone);
		Collections.addAll(tuesdayTasks, databaseCode, interfaceCode, paulPhone);

		System.out.println(phoneTasks.toString().equals("[phone Mike, phone Paul]"));
		System.out.println(codingTasks.toString().equals("[code db, code gui, code logic]"));
		System.out.println(mondayTasks.toString().equals("[code logic, phone Mike]"));
		System.out.println(tuesdayTasks.toString().equals("[code db, code gui, phone Paul]"));
		
	   //Removing Elements will call equals
		//mondayTask collection has logic code and mikePhone
		System.out.println(mondayTasks.remove(mikePhone));
	
	
		//using retainAll
		//Retains only the elements in this collection that 
		//are contained in the specified collection (optional operation).
		
		//retainAll(Collection<?> c)
		System.out.println("*****************************************************");
		System.out.println("learning retainsAll method");
		System.out.println(".................");
		
		Collection<Task> phoneTuesdayTasks = new ArrayList<Task>(tuesdayTasks);
		System.out.println("All tuesdayTasks ");
		System.out.println(phoneTuesdayTasks);
		System.out.println(".................");
		
		//out of tuesdayTasks , retain all the phoneTasks
		phoneTuesdayTasks.retainAll(phoneTasks);
		
		System.out.println(phoneTuesdayTasks);
		
		System.out.println(".................");
		System.out.println("using set ");
		System.out.println(".................");
		//Collections.addAll(mondayTasks, logicCode, mikePhone);
		Set<Task> phoneAndMondayTasks = new TreeSet<Task>(mondayTasks);
		phoneAndMondayTasks.addAll(phoneTasks);
		
		Set<Task> s1 = new HashSet<Task>(8);
		s1.addAll(phoneTasks);
		
		
	}

}
