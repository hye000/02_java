package com.kh.object.practice6.run;

import com.kh.object.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book book1 = new Book("소년이 온다", "창비", "한강");	//할당과 동시에 값 초기화
		book1.inform();
		
		Book book2 = new Book("모순", "쓰다", "양귀자", 13000, 11700);
//		book2.setTitle("모순");
//		book2.setPublisher("쓰다");
//		book2.setAuthor("양귀자");
//		book2.setPrice(13000);
//		book2.setDiscountRate(11700);
		book2.inform();

	}

}
