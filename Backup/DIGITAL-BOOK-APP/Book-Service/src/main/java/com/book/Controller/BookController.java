package com.book.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/getBookByBookID/{bookID}")
	public Optional<Book> getByCategory(@PathVariable Integer bookID){
		Optional<Book> book = bookService.getBookByBookID(bookID);
		return book;	
	}
	
	@GetMapping("/getByCategory/{category}")
	public List<Book> getByCategory(@PathVariable String category){
		List<Book> book = bookService.getBookByCategory(category);
		return book;	
	}
	
	
	
	@PatchMapping("/status/{bookID}")
	public ResponseEntity<Book> updateStatus(@PathVariable Integer bookID, @RequestBody Book book ) {
		return new ResponseEntity<Book>(bookService.chageBookStatus(book, bookID), HttpStatus.OK);
	}
	
	@PutMapping("/updateBookDetails/{id}")
	public ResponseEntity<Book> updateBookDetails(@PathVariable("id") Integer id, @RequestBody Book book ) {
		return new ResponseEntity<Book>(bookService.updateBookDetails(book, id), HttpStatus.OK);
	}
	
}


