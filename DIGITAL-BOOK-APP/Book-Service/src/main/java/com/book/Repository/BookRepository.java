package com.book.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.book.Entity.Book;

public class BookRepository implements JpaRepository<Book, String> {




	@Override
	public Book save(Book book) {
		
		return null;
	}

}
