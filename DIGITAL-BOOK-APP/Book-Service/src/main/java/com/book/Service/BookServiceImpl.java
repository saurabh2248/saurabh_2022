package com.book.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.Entity.Book;
import com.book.Exception.ResourceNotFoundException;
import com.book.Repository.IBookRepository;

@Service
public class BookServiceImpl implements IBookSevice {

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

	@Override
	public Optional<Book> getBookByBookID(Integer bookID) {
		return bookRepository.findById(bookID);

	}
	
	@Override
	public List<Book> getBookByCategory(String category) {
		return bookRepository.findByCategory(category);

	}

	@Override
	public Book chageBookStatus(Book book, Integer bookID) {
		Book existingBook = bookRepository.findById(bookID)
				.orElseThrow(() -> new ResourceNotFoundException("Book", "bookID", bookID));

		existingBook.setActive(book.isActive());

		bookRepository.save(existingBook);
		return existingBook;
	}

	@Override
	public Book updateBookDetails(Book book, Integer bookID) {
		Book existingBook = bookRepository.findById(bookID)
				.orElseThrow(() -> new ResourceNotFoundException("Book", "bookID", bookID));

		existingBook.setLogo(book.getLogo());
		existingBook.setTitle(book.getTitle());
		existingBook.setCategory(book.getCategory());
		existingBook.setPrice(book.getPrice());
		existingBook.setAuthor(book.getAuthor());
		existingBook.setPublisher(book.getPublisher());
		existingBook.setPublishDate(book.getPublishDate());
		existingBook.setContent(book.getContent());
		existingBook.setActive(book.isActive());

		bookRepository.save(existingBook);
		return existingBook;
	}

}
