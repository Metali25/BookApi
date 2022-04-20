package com.nagarro.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.library.entity.Book;

/**
 * To help import predefined functions of Jpa repository
 * 
 * @author metalithareja
 *
 */
public interface BookDao extends JpaRepository<Book, Integer> {

}
