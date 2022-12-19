package com.book.mapper;

import org.modelmapper.ModelMapper;

import com.book.Entity.Book;
import com.book.dto.BookInfoDto;


public class BookMapper {
   
	public BookInfoDto EntityToDto(Book book) {
		ModelMapper mapper = new ModelMapper();
		mapper.map(Book, destination);
	}
}
