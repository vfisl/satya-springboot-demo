package com.bookapp.service;

import java.util.List;

import com.bookapp.model.Book;

public interface IBookService {
	void addBook(Book book);
	void updateBook(Book book);
	void deleteBook(int bookId);
	List<Book> getByAuthor(String author);
	List<Book> getByCategory(String category);
	List<Book> getAll();
	Book getById(int bookId);
	List<Book> getByPrice(double price);

}
