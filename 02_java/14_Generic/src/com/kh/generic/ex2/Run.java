package com.kh.generic.ex2;

public class Run {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<>();	// new Boxx<Apple>();
		aBox.set(new Apple());
		Apple apple = aBox.get();
		System.out.println(apple);
		
		// 문제가 있었던 코드 다시 작성
		Box<Orange> oBox = new Box<>();		// new Box<Orange>();
//		Orange orange = set("Orange");
		// => 컴파일 오류 발생, Orange타입으로 데이터를 전달해야 하는데 문자열로 전달 함
		
	}

}
