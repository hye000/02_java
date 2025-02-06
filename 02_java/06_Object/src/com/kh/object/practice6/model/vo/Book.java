package com.kh.object.practice6.model.vo;

public class Book {

	// 필드부
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// 생성부
	public Book() {
		
	}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	// getter, setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	// 메소드부
	public void inform() {
		System.out.printf("제목 : %s | 출판사 : %s | 작가 : %s | 가격 : %d | 할인 가격: %d \n",title, publisher, author, price, (int)discountRate);
	}
}
