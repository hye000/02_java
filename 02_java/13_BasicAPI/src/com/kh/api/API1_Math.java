package com.kh.api;

public class API1_Math {

	/*
	 * java.lang.Math 클래스
	 * => 모든 필드가 상수 필드(final)
	 * => 모든 메소드가 static 메소드
	 */
	public static void main(String[] args) {
		// 상수 필드
		// - PI : 파이값을 저장하고 있는 필드
		System.out.println("Math.PI : " + Math.PI);
		
		// static 메소드
		// - random() : 랜덤값을 반환하는 메소드
		System.out.println("Math.random() : " + Math.random());
		
		// - abs() : absolute 절대값을 반환하는 메소드
		int n = -124;
		System.out.println("Math.abs(n) : " + Math.abs(n));
		
		// - pow() : 제곱값을 반환하는 메소드
		System.out.println("2의 10승 : " + Math.pow(2, 10));
		
		// - ceil() : 올림처리 해주는 메소드
		double d = 12.49;
		System.out.println("Math.ceil(d) : " + Math.ceil(d));
		
		// - round() : 반올림처리 해주는 메소드
		System.out.println("Math.round(d) : " + Math.round(d));
		
		// - floor() : 내림(버림) 처리
		System.out.println("Math.floor(d) : " + Math.floor(d));
	}

}
