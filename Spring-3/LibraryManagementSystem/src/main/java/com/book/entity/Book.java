package com.book.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookID;
	private String bookName;
	private String bookAuthor;
	private Float bookPrice;
	private String bookGenre;
	private Boolean borrowedStatus;

	public Book(Integer bookID, String bookName, String bookAuthor, Float bookPrice, String bookGenre,
			boolean borrowedStatus) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookGenre = bookGenre;
		this.borrowedStatus = borrowedStatus;
	}

	public Book() {
		super();
	}

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public boolean isBorrowedStatus() {
		return borrowedStatus;
	}

	public void setBorrowedStatus(boolean borrowedStatus) {
		this.borrowedStatus = borrowedStatus;
	}

}