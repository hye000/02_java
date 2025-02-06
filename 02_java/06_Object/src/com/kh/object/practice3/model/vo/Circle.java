package com.kh.object.practice3.model.vo;

public class Circle {

	// 필드
	private static final double PI = 3.14;
	private static int radius = 1;
	
	// 생성
	public Circle() {}
	
	
	// 메소드
	// get set
	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() {
		System.out.println("원의 둘레 : " + 2 * PI * radius);
	}
	
	public void getSizeOfCircle() {
		System.out.println("원의 넓이 : " + radius * radius * PI);
	}
}
