package com.spring.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.spring.domain.Book;
import com.spring.mapper.BookMapper;
import com.spring.domain.Author;

@Service
public class BookService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BookMapper bookMapper;
	
	public List<Book> query(){
		String sql = "select id,bookName,bookAuthor,bookPage,bookDesc from book";
		
		List<Book> bookList = jdbcTemplate.query(sql, new RowMapper<Book>(){
			@Override
			public Book mapRow(ResultSet resultSet,int i) throws SQLException{
				Book book = new Book();
				book.setId(resultSet.getInt("id"));
				book.setBookName(resultSet.getString("bookName"));
				book.setBookAuthor(resultSet.getString("bookAuthor"));
				book.setBookPage(resultSet.getInt("bookPage"));
				book.setBookDesc(resultSet.getString("bookDesc"));
				return book;
			}
		});
		return bookList;
	}
	
	public List<Author> queryBookAuthor(){
		String sql = "select bookAuthor,sex,nation,authorDesc from author";
		
		List<Author> authorList = jdbcTemplate.query(sql, new RowMapper<Author>(){
			@Override
			public Author mapRow(ResultSet resultSet, int i) throws SQLException{
				Author author = new Author();
				author.setBookAuthor(resultSet.getString("bookAuthor"));
				author.setSex(resultSet.getString("sex"));
				author.setNation(resultSet.getString("nation"));
				author.setAuthorDesc(resultSet.getString("authorDesc"));
				return author;
			}
		});
		return authorList;
	}
	
	//根据书名查询
    public List<Book> likeBookName(String bookName){
    	return bookMapper.likeBookName(bookName);
    }
	
	//根据作者名查询
	public List<Author> likeBookAuthor(String bookAuthor){
		return bookMapper.likeBookAuthor(bookAuthor);
	}

}
