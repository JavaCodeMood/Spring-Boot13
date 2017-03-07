package com.spring.domain;

/**
 * 图书实体层
 * @author dell
 *
 */
public class Book {
	private int id;
	private String bookName;   //图书书名
	private String bookAuthor;   //图书作者
	private int bookPage;   //图书页数
	private String bookDesc;   //图书描述
	
	public Book() {
		super();
	}

	public Book(int id, String bookName, String bookAuthor, int bookPage, String bookDesc) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPage = bookPage;
		this.bookDesc = bookDesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookPage() {
		return bookPage;
	}

	public void setBookPage(int bookPage) {
		this.bookPage = bookPage;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPage=" + bookPage
				+ ", bookDesc=" + bookDesc + "]";
	}
	

}
