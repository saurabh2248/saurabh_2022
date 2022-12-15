package com.book.Service;

import java.util.List;

import com.book.Entity.Book;

public interface IBookSevice {

	public Integer saveBook(Book book);
	public List<Book> getAllBook();

}
