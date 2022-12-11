package com.book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.Entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {

}
