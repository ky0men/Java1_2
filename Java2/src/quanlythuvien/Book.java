package quanlythuvien;

import java.util.Scanner;

public class Book {
	private String bookName, authorName, publishDate, publisher;
	private double price;

	public Book() {
	}

	public Book(String bookName, String authorName, String publishDate, String publisher, double price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishDate = publishDate;
		this.publisher = publisher;
		this.price = price;
	}

	public void input(Scanner sc) {
		System.out.println("Nhap ten sach: ");
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
