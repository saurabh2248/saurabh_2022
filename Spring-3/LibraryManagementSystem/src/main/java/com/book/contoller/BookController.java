package com.book.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.exception.ResourceNotFoundException;
import com.book.repository.IBookRepository;
import com.book.service.IBookService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookController {
	
	@Autowired
	private IBookService bookService;
	
	@Autowired
	private IBookRepository bookrepository;
	
	//For creating new book
	@PostMapping("/books")
	public Integer createBook(@RequestBody Book book ) {
		Integer bookID = bookService.saveBook(book);
		return bookID;
	}

	//For getting all books
	@GetMapping("/books")
	public List<Book> getBook(){
		return bookService.getAllBook();
	}
	
	//Get book by id
	@GetMapping("/books/{bookID}")
	public ResponseEntity<Book> getBookByID(@PathVariable Integer bookID){
		Book book = bookrepository.findById(bookID)
				.orElseThrow(()-> new ResourceNotFoundException("Book not exist with id :"+ bookID));
		return ResponseEntity.ok(book);
	}
	
	
	//Delete book 
	@DeleteMapping("/books/{bookID}")
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
	@PutMapping("/books/{id}")
	public ResponseEntity<Book> updateEmployee(@PathVariable("id") Integer id, @RequestBody Book book ) {
		return new ResponseEntity<Book>(bookService.updateBook(book, id), HttpStatus.OK);
	}
	
	//update book status
	@PatchMapping("/books/{id}")
	public ResponseEntity<Book> updateStatus(@PathVariable("id") Integer id, @RequestBody Book book ) {
		return new ResponseEntity<Book>(bookService.updateStatus(book, id), HttpStatus.OK);
	}
}