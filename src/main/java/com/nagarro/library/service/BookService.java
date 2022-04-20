package com.nagarro.library.service;

import java.util.List;

import com.nagarro.library.entity.Book;

/**
 * For declare the operations to be done on Book Data
 * 
 * @author metalithareja
 *
 */
public interface BookService {
	
	public List<Book> getBooks();

	public Book getBook(int id);

	public void deleteBook(int id);

	public Book updateBook(Book book);

	public Book addBooks(Book book);

}
