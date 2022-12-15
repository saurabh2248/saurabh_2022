package com.book.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.Entity.Book;
import com.book.Repository.IBookRepository;

@Service
public class BookServiceImpl implements IBookSevice  {

	@Autowired
	private IBookRepository bookRepository;
	
	@Override
	public Integer saveBook(Book book) {
	Book savedBook = bookRepository.save(book);
		return savedBook.getId();
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepository.findAll();
		
	}

	

}
