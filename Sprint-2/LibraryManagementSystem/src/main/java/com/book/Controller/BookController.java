package com.book.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.Entity.Book;
import com.book.Service.IBookService;

@RestController
public class BookController {
	
	@Autowired
	private IBookService bookService;
	
	//For creating new book
	@PostMapping("/add/book")
	public Integer createBook(@RequestBody Book book ) {
		Integer bookID = bookService.saveBook(book);
		return bookID;
	}

	//For getting all books
	@GetMapping("/allbooks")
	public List<Book> getBook(){
		return bookService.getAllBook();
	}
	
	//Get book by id
	@GetMapping("/get/{bookID}")
	public Optional<Book> getBook(@PathVariable Integer bookID){
		Optional<Book> book = bookService.getBook(bookID);
		return book;
	}
	
	//Delete book 
	@DeleteMapping("/remove/{bookID}")
	public ResponseEntity<Book> deleteBook(@PathVariable Integer bookID){
		ResponseEntity<Book> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			bookService.deleteBook(bookID);
			
		}catch(Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
		}
	return responseEntity;	
	}
	
	//update book by id
	@PutMapping("/update/{id}")
	public ResponseEntity<Book> updateEmployee(@PathVariable("id") Integer id, @RequestBody Book book ) {
		return new ResponseEntity<Book>(bookService.updateBook(book, id), HttpStatus.OK);
	}
	
	//update book status
	@PatchMapping("/borrow/{id}")
	public ResponseEntity<Book> updateStatus(@PathVariable("id") Integer id, @RequestBody Book book ) {
		return new ResponseEntity<Book>(bookService.updateStatus(book, id), HttpStatus.OK);
	}
}
