package com.book.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.Entity.Book;


public interface IBookRepository extends JpaRepository<Book, Integer> {
	
	List<Book> findByCategoryAndTitleAndAuthorAndPriceAndPublisher(String category, String title, String author, Long price, String publisher);
	List<Book> findByCategory(String category);
    
	
}
