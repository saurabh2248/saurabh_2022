package com.book.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.book.Entity.Book;
import com.book.Exception.ResourceNotFoundExceptionHandler;
import com.book.Repository.IBookRepository;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookRepository bookRepository;

	@Override
	public Integer saveBook(Book book) {
		Book savedBook = bookRepository.save(book);
		return savedBook.getBookID();
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepository.findAll();
	}

	@Override
	public Optional<Book> getBook(Integer bookID) {
		return bookRepository.findById(bookID);
	}

	@Override
	public void deleteBook(Integer bookID) {
		bookRepository.deleteById(bookID);

	}

	@Override
	public Book updateBook(Book book, Integer bookID) {
		Book availableBook = bookRepository.findById(bookID)
				.orElseThrow(() -> new ResourceNotFoundExceptionHandler("Book", "bookID", bookID));

		availableBook.setBookName(book.getBookName());
		availableBook.setBookAuthor(book.getBookAuthor());
		availableBook.setBookPrice(book.getBookPrice());
		availableBook.setBookGenre(book.getBookGenre());
		availableBook.setBorrowedStatus(book.isBorrowedStatus());

		bookRepository.save(availableBook);
		return availableBook;
	}

	@Override
	public Book updateStatus(Book book, Integer bookID) {
		Book availableBook = bookRepository.findById(bookID)
				.orElseThrow(() -> new ResourceNotFoundExceptionHandler("Book", "bookID", bookID));
		availableBook.setBorrowedStatus(book.isBorrowedStatus());
		bookRepository.save(availableBook);
		return availableBook;
	}

}
