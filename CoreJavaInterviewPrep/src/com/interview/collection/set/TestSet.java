package com.interview.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

abstract class Task implements Comparable<Task> {
	protected Task() {
	}

	public boolean equals(Object o) {
		System.out.println("equals called on object : " + this + " isEqual? " + o);
		if (o instanceof Task) {
			return toString().equals(o.toString());
		} else
			return false;
	}

	public int compareTo(Task t) {
		System.out.println("compareTo called : " + t);
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

enum Priority {
	HIGH, MEDIUM, LOW
}

final class PriorityTask implements Comparable<PriorityTask> {
	private final Task task;
	private final Priority priority;

	PriorityTask(Task task, Priority priority) {
		this.task = task;
		this.priority = priority;
	}

	public Task getTask() {
		return task;
	}

	public Priority getPriority() {
		return priority;
	}

	public int compareTo(PriorityTask pt) {
		System.out.println("priority task compareTo : "+pt+" for "+this);
		int c = priority.compareTo(pt.priority);
		//if same priority c = 0, else 
		return c != 0 ? c : task.compareTo(pt.task);
	}

	public boolean equals(Object o) {
		System.out.println("priority task equals");
		if (o instanceof PriorityTask) {
			PriorityTask pt = (PriorityTask) o;
			return task.equals(pt.task) && priority.equals(pt.priority);
		} else
			return false;
	}

	public int hashCode() {
		System.out.println("priority task hashcode");
		return task.hashCode();
	}

	public String toString() {
		return task + ": " + priority;
	}
}

public class TestSet {

	public static void main(String[] args) {

		// phone tasks
		PhoneTask mikePhone = new PhoneTask("Mike", "987 6543");
		PhoneTask paulPhone = new PhoneTask("Paul", "123 4567");

		// coding tasks
		CodingTask databaseCode = new CodingTask("db");
		CodingTask interfaceCode = new CodingTask("gui");
		CodingTask logicCode = new CodingTask("logic");

		// 4 types of collection
		Collection<PhoneTask> phoneTasks = new ArrayList<PhoneTask>();
		Collection<CodingTask> codingTasks = new ArrayList<CodingTask>();
		Collection<Task> mondayTasks = new ArrayList<Task>();
		Collection<Task> tuesdayTasks = new ArrayList<Task>();

		// addAll(Collection<? super T> c, T... elements)

		Collections.addAll(phoneTasks, mikePhone, paulPhone);
		Collections.addAll(codingTasks, databaseCode, interfaceCode, logicCode);
		Collections.addAll(mondayTasks, logicCode, mikePhone);
		Collections.addAll(tuesdayTasks, databaseCode, interfaceCode, paulPhone);

		System.out.println("using set ");
		System.out.println(".................");
		// Collections.addAll(mondayTasks, logicCode, mikePhone);
		Set<Task> phoneAndMondayTasks = new TreeSet<Task>(mondayTasks);
		phoneAndMondayTasks.addAll(phoneTasks);

		Set<Task> s1 = new HashSet<Task>(8);
		s1.addAll(phoneTasks);
		System.out.println(s1);

		NavigableSet<PriorityTask> priorityTasks = new TreeSet<PriorityTask>();
		priorityTasks.add(new PriorityTask(mikePhone, Priority.MEDIUM));
		priorityTasks.add(new PriorityTask(paulPhone, Priority.HIGH));
		priorityTasks.add(new PriorityTask(databaseCode, Priority.MEDIUM));
		priorityTasks.add(new PriorityTask(interfaceCode, Priority.LOW));
        
		System.out.println(priorityTasks.toString());
	}

}
