package com.kh.inter.ex2;

public interface Shape {
	// 필드부 --> 상수만 가능
	public double calculateArea();
	// 추상메소드 : 미완성된 메소드 (기능)
	//			  => {몸체}, 구현부가 없는 형태
	//			  => 해당 인터페이스를 상속하는 경우 추상메소드를 오버라이딩하여 구현해야함
}
