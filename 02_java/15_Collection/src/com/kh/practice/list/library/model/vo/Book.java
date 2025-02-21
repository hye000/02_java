package com.kh.practice.list.library.model.vo;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {
	}

	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\t" + "(" + title + "/" + author + "/" + category + "/" + price + ")";
	}
	
	public int hashCode() {
		return (title + author + category + price).hashCode();
	}
	
	public boolean equals(Book bk) {
		if(bk instanceof Book) {
			Book b = bk;
			if(this.title.equals(bk.getTitle())
					&& this.author.equals(bk.getAuthor())) {
				return true;
			}
		}
		return false;
	}
	
	// Comparable 인터페이스 메소드
	@Override
	public int compareTo(Book o) {

		// 정렬 기준에 대하여 작성
		// --> 책 이름(String) 오름차순
		
		// 반환 값에 따라 정렬 순서가 정해짐
		// 0 : 동일한 값
		// 음수 :  A.compareTo(B) --> A B 순서로 정렬
		// 양수 :  A.compareTo(B) --> B A 순서로 정렬
		// String의 경우 compareTo 메소드가 재정의 되어 있음
		
		return this.title.compareTo(o.getTitle());
	}
	
	
}
