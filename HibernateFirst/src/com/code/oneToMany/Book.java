package com.code.oneToMany;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

@Entity(name = "Book")
public class Book {

	@Id
	@GeneratedValue
	private Long id;

	private String title;

	private String author;

	@NaturalId //unique keys
    @Column(nullable = false, unique = true)
	private long isbn;
	
	public void setTitle(String title) {
		this.title = title ;
		
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long i) {
		this.isbn = i;
	}

	public String getTitle() {
		return title;
	}
	//Getters and setters are omitted for brevity

	@Override
	public boolean equals(Object o) {
		if ( this == o ) {
			return true;
		}
		if ( o == null || getClass() != o.getClass() ) {
			return false;
		}
		Book book = (Book) o;
		return Objects.equals( isbn, book.isbn );
	}

	@Override
	public int hashCode() {
		return Objects.hash( isbn );
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}

	
}