package com.book.dto;

import java.util.Date;

public class BookInfoDto {

	private Integer bookID;
	private String bookLogo;
	private String bookTitle;
	private String bookCategory;
	private Long bookPrice;
	private String bookAuthor;
	private String BookPublisher;
	private Date bookPublishDate;

	public BookInfoDto(Integer bookID, String bookLogo, String bookTitle, String bookCategory, Long bookPrice,
			String bookAuthor, String bookPublisher, Date bookPublishDate) {
		super();
		this.bookID = bookID;
		this.bookLogo = bookLogo;
		this.bookTitle = bookTitle;
		this.bookCategory = bookCategory;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
		BookPublisher = bookPublisher;
		this.bookPublishDate = bookPublishDate;
	}

	public BookInfoDto() {
		super();
	}

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}

	public String getBookLogo() {
		return bookLogo;
	}

	public void setBookLogo(String bookLogo) {
		this.bookLogo = bookLogo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public Long getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Long bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return BookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		BookPublisher = bookPublisher;
	}

	public Date getBookPublishDate() {
		return bookPublishDate;
	}

	public void setBookPublishDate(Date bookPublishDate) {
		this.bookPublishDate = bookPublishDate;
	}

}
