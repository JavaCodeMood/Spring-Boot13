package com.spring.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.domain.Book;
import com.spring.domain.Author;
import com.spring.service.BookService;

import java.util.List;

import org.slf4j.Logger;

@RestController
public class BookController {
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	private BookService bookService;
	
	//查询全部图书信息
	@RequestMapping("/query")
	public List<Book> query(){
		logger.info("从数据库查询book表");
		return bookService.query();
	}
	
	//查询作者信息
	@RequestMapping("/queryAuthor")
	public List<Author> queryBookAuthor(){
		logger.info("从数据库查询bookAuthor表");
		return bookService.queryBookAuthor();
	}
	
	//根据书名查询
	@RequestMapping("/bookName/{bookName}")
	public List<Book> likeBookName(@PathVariable("bookName") String bookName){
		return bookService.likeBookName(bookName);
	}
	
	//根据作者查询
	@RequestMapping("/bookAuthor/{bookAuthor}")
	public List<Author> likeBookAuthor(@PathVariable("bookAuthor") String bookAuthor){
		return bookService.likeBookAuthor(bookAuthor);
	}

}
