package com.code.oneToMany;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "Library")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;

	private String name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_lib_id")
	private Set<Book> books = new HashSet<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public Library() {
		
	}
	public Library(String name, Set<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", books=" + books + "]";
	}
}
