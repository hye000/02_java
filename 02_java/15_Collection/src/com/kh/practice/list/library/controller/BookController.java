package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	private List<Book> bookList = new ArrayList();

	public BookController() {
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	
	public ArrayList selectList() {
		return (ArrayList)bookList;
	}
	
	public ArrayList searchBook(String keyword) {
		
		ArrayList searchList = new ArrayList();
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}
		return searchList;
	}
	
	public Book deleteBood(String title, String author) {
		
		Book removeBook = null;
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(title) 
					&& bookList.get(i).getAuthor().equals(author)) {
				removeBook = bookList.remove(i);
			}
		}
		return removeBook;
	}
	
	public int ascBook() {
		// 책 이름으로 오름차순 정렬
		// Collenctions.sort(컬렉션객체)
		// => 대상(Book)클래스에 compareTo() 를 참고하여 정렬
		//					  ---> 정렬 기준으로 재정의
		Collections.sort(bookList);
		return 1;
	}
	
	
}
