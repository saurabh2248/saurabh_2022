package com.book.Service;

import java.util.List;
import java.util.Optional;

import com.book.Entity.Book;

public interface IBookSevice {

	public Integer saveBook(Book book);

	public List<Book> getAllBook();


	public Book chageBookStatus(Book book, Integer bookID);

	public Book updateBookDetails(Book book, Integer bookID);

	public Optional<Book> getBookByBookID(Integer bookID);
	
	public List<Book> getBookByCategory(String category);

}
