package com.kh.generic.ex3;

// 타입 제한하기
// <T extends 클래스 또는 인터페이스>
// => 클래스 또는 인터페이스르 상속(구현)하는 타입으로 제한
// 		* 클래스인 경우 해당 클래스도 포함

public class Box<T extends Number> {
	// => Number 클래스를 상속하는 타입으로 제한
	private T ob;
	// Object 클래스는 최상위 클래스로, 모든 클래스의 인스턴스를 저장할 수 있다(참조 가능)
	public T get() {
		return ob;
	}
	public void set(T ob) {
		this.ob = ob;
	}
}

class Apple{
	@Override
	public String toString() {
		return "I'm an apple.";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I'm an Orange.";
	}
}
