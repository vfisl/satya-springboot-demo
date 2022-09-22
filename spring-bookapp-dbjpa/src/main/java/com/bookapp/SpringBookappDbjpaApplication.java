package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappDbjpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappDbjpaApplication.class, args);
	}
  @Autowired
  IBookService  iBookService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Book book= iBookService.getById(100);
//		
//		Book nbook= new Book("secret","Rhonde","selfhelp",700);
//		iBookService.addBook(nbook);
//		book.setAuthor("Kathy Kiara");
//		book.setPrice(12000);
		//iBookService.updateBook(book);
		iBookService.getByAuthor("Kathy Kiara").forEach(System.out::println);
		//iBookService.getAll().forEach(System.out::println);
		System.out.println("finnd by author");
		iBookService.getByCategory("selfhelp").forEach(System.out::println);
		System.out.println("by price");
		iBookService.getByPrice(10000).forEach(System.out::println);
		
	}

}
