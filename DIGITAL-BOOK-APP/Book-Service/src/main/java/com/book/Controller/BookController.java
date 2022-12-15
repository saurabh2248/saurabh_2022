package com.book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.Entity.Book;
import com.book.Repository.IBookRepository;
import com.book.Service.IBookSevice;

@RestController
public class BookController {
	
	@Autowired
	private IBookSevice bookService;
	
	@Autowired
	private IBookRepository bookRepository;
	
	
	
	@PostMapping("/books")
	Integer createBook(@RequestBody Book book){
		return bookService.saveBook(book);
	}

	
	@GetMapping("/search")
	public ResponseEntity<List<Book>> getBookByCategoryAndTitleAndAuthorAndPriceAndPublisher(
	        @RequestParam String category,
			@RequestParam String title, 
			@RequestParam String author, 
			@RequestParam Long price, 
			@RequestParam String publisher){
	return new ResponseEntity<List<Book>>(bookRepository.findByCategoryAndTitleAndAuthorAndPriceAndPublisher(category, title, author, price, publisher), HttpStatus.OK);
	}
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks(){
		return bookService.getAllBook();
	}
}
