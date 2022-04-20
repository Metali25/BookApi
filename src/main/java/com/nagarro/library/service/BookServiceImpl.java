package com.nagarro.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.library.dao.BookDao;
import com.nagarro.library.entity.Book;

/**
 * To define functions done on Book Data
 * 
 * @author metalithareja
 *
 */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public List<Book> getBooks() {

		return bookDao.findAll();
	}

	@Override
	public Book getBook(int id) {

		return bookDao.getById(id);

	}

	@Override
	public Book addBooks(Book book) {

		bookDao.save(book);
		return book;

	}

	@Override
	public Book updateBook(Book book) {

		bookDao.save(book);
		return book;
	}

	@Override
	public void deleteBook(int id) {

		Book book = bookDao.getById(id);
		bookDao.delete(book);

	}

}
