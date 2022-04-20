package com.nagarro.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

/**
 * This class is responsible for defining the model of book and its properties
 * 
 * @author metalithareja
 *
 */
@Entity(name = "mybook")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Book_Name")
	private String name;
	
	@Column(name = "Author")
	private String author;

	@Column(name = "Date_Added")
	private String dateAdded;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(int id, String name, String author, String dateAdded) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.dateAdded = dateAdded;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public String toString() {
//		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", dateAdded=" + dateAdded + "]";
//	}

}
