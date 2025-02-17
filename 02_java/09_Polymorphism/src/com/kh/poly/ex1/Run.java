package com.kh.poly.ex1;

public class Run {

	public static void main(String[] args) {

		/*
		 	클래스명 참조변수 = new 클래스생성자; => 클래스 생성자 : 클래스명();
		 	ㄴ*부모클래스 올 수 있음     ㄴ*자식클래스로 생성할 수 있음
		 	실제로 어디까지					실제로 어떤 형태로 메모리에
		 	접근할 수 있는가?						생성되었는가?
		 */
		
		Cake c1 = new CheeseCake();
		// 부모클래스 = 자식클래스 -> 가능
		// -> Cake 클래스 멤버까지 접근 가능하며, 메모리 공간은 CheeseCake 형태로 생성되어 있다
		
		c1.sweet();
		c1.yummy();		// => 오버라이딩 된 메소드는 실제 메모리에 있는 재정의된 메소드가 실행된다(동적바인딩)
		
		// CheeseCake c2 = new Cake();
		// => Type mismatch: cannot convert from Cake to CheeseCake
		// => 실제 메모리 공간에 Cake 형태로 생성한다면, CheeseCake로 접근할 수 없음
		/*
		 	CheeseCake		Cake
		 	sweet()			sweet()
		 	yummy()			yummy()
		 	milky()			x
		 */
	}

}
