package com.kh.inter.ex1;

// 인터페이스 상속(구현)
public class Cat implements Animal{
	// Cat 클래스는 Animal 인터페이스를 구현
	// => 해당 인터페이스의 추상 메소드를 오버라이딩 해야만 객체 생성 가능
	// 	  추상 메소드를 오버라이딩 하지 않으면 현재 클래스는 추상 메소드를 가지게 되어 추상 클래스가 될 것 => 객체 생성 불가
	
	// alt + shift + s -> v
	@Override
	public void move() {
		System.out.println("Cat이 사뿐사뿐 걷습니다");
	}
	
	public void eat() {
		System.out.println("Cat이 츄르를 먹습니다");
	}
	
	public void makeSound() {
		System.out.println("냐옹");
	}
	
}
