package com.nagarro.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.library.entity.Book;
import com.nagarro.library.service.BookService;

/**
 * This class is responsible for accepting the requests from client
 * 
 * @author metalithareja
 *
 */
@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> getBooks() {

		return this.bookService.getBooks();
	}

	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable(value = "id") String id) {

		return this.bookService.getBook(Integer.parseInt(id));
	}

	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBooks(book);
	}

	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return this.bookService.updateBook(book);
	}

	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable String id) {

		this.bookService.deleteBook(Integer.parseInt(id));
	}

}
