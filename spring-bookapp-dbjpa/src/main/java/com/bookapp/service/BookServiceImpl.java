package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	IBookRepository iBookRepository;
	@Override
	public void addBook(Book book) {
		iBookRepository.save(book);
		
	}

	@Override
	public void updateBook(Book book) {
		iBookRepository.save(book);
		
	}

	@Override
	public void deleteBook(int bookId) {
		iBookRepository.deleteById(null);
		
	}

	@Override
	public List<Book> getByAuthor(String author) {
		return iBookRepository.findByAuthor(author);
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		return iBookRepository.findByCategory(category);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return iBookRepository.findAll();
	}

	@Override
	public Book getById(int bookId) {
		java.util.Optional<Book> bookOpt=iBookRepository.findById(bookId);
		if(bookOpt.isPresent())
			return bookOpt.get();
		return null;
	}

	@Override
	public List<Book> getByPrice(double price) {
		// TODO Auto-generated method stub
		return iBookRepository.findByPriceLessThan(price);
	}

}
