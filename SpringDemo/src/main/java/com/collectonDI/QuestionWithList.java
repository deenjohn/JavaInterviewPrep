package com.collectonDI;

import java.util.Iterator;
import java.util.List;

public class QuestionWithList {
	private int id;
	private String name;
	private List<String> answers;

	public void init() {
		System.out.println("Bean is going through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy now.");
	}

	public QuestionWithList() {
	}

	public QuestionWithList(int id, String name, List<String> answers) {
		super();
		System.out.println("construct");
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("answers are:");
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}