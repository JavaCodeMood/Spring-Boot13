package com.spring.domain;

/**
 * 图书作者实体层
 * @author dell
 *
 */
public class Author {
	private String bookAuthor;  //图书作者
	private String sex;  //作者性别
	private String nation;  //作者国籍
	private String authorDesc;  //作者简介
	
	public Author() {
		super();
	}

	public Author(String bookAuthor, String sex, String nation, String authorDesc) {
		super();
		this.bookAuthor = bookAuthor;
		this.sex = sex;
		this.nation = nation;
		this.authorDesc = authorDesc;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getAuthorDesc() {
		return authorDesc;
	}

	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}

	@Override
	public String toString() {
		return "BookAuthor [bookAuthor=" + bookAuthor + ", sex=" + sex + ", nation=" + nation + ", authorDesc="
				+ authorDesc + "]";
	}
	

}
