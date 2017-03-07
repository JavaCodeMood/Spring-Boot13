package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.spring.domain.Author;
import com.spring.domain.Book;



@Mapper
public interface BookMapper {
	//根据书名查询
	@Select("select * from book where bookName = #{bookName}")
	public List<Book> likeBookName(String bookName);
	
	//根据作者名查询
	@Select("select * from author where bookAuthor = #{bookAuthor}")
	public List<Author> likeBookAuthor(String bookAuthor);

}
