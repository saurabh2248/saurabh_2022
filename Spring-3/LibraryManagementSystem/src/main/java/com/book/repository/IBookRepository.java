package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {

}