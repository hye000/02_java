package com.kh.object.ex3;

public class Run {

	public static void main(String[] args) {
		// 클래스명 참조변수명 = new 클래스명(); => 생성자를 호출
		// [기본 생성자]
		Book b1 = new Book();
//		b1.title = "자바의 정석";
//		=> title 변수에 접근 불가 (private으로 선언되어 있기 때문에 해당 클래스 내에서만 접근 가능함)

		b1.setTitle("자바의 정석");	//값을 저장
		String b1Title = b1.getTitle();				//값을 조회
		System.out.println(b1Title);
		
		// [매개변수를 가진 생성자]
		Book b2 = new Book("자바 프로그래밍 입문", "전공 서적", "박은종");
		b2.setTitle("Doit! 자바 프로그래밍 입문");
		String info = b2.toString();	//문자열을 전달받아 변수에 저장
		System.out.println(info);
	}

}
