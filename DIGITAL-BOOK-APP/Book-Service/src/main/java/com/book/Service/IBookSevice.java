package com.book.Service;

import java.util.List;

import com.book.Entity.Book;

public interface IBookSevice {
	
	List<Book> getBookForUser(String userID);

}
