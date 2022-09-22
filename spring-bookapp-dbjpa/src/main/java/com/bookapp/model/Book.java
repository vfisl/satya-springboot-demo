package com.bookapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//jpa will convert this into table 
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name ="mybook")
public class Book {
	private String title;
	@Id//primary key
	@GeneratedValue(generator="book_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="book_gen",sequenceName = "book_sequence",initialValue = 100,allocationSize = 1)
	private Integer bookId;
	private String author;
	private String category;
	@Column(name="cost")
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, Integer bookId, String author, String category, double price) {
		super();
		this.title = title;
		this.bookId = bookId;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public Book(String title, String author, String category, double price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", bookId=" + bookId + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}

	

}
