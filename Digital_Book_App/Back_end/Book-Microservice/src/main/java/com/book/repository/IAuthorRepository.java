package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.entity.Author;

public interface IAuthorRepository extends JpaRepository<Author,Integer> {

}
