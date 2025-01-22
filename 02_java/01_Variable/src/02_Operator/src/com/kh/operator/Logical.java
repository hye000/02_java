package com.kh.operator;

import java.util.Scanner;

public class Logical {

	/*
	 * 논리연산자 (이항 연산자) : 두 개의 논리값을 연산(true/false)
	 * 					  : 결괏값도 논리값
	 * 	*종류 : && ||
	 * 
	 * - A && B : A,B 모두 true여야함 -
	 * 	true && true => true
	 * 	true && false => false
	 * 	false && true => false
	 * 	false && false => false
	 * 
	 * - A || B : A,B 둘 중 하나만 true여도 됨 -
	 * 	true && true => true
	 * 	true && false => true
	 * 	false && true => true
	 * 	false && false => false
	 * -----------------------------------------
	 * 주의사항. SCE(Short-Circuit Evaluation)
	 *  * && 연산자의 경우 : 앞의 조건이 false면 뒤 조건은 실행되지 않는다
	 *  * || 연산자의 경우 : 앞의 조건이 true면 뒤 조건은 실행되지 않는다
	 */
	
	public static void main(String[] args) {
//		method1();
		method2();
	}
	
	public static void method2() {
		//입력 받은 문자가 소문자인지 확인
		// a : 97 ~ z : 122
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자를 입력하세요 : ");
		String str = sc.next();
		char ch = str.charAt(0);
		// => char ch = sc.next().charAt(0); 짧게 바로 작성하는 코드
		
		boolean result = (ch >= 97 && ch <= 122);
		// => boolean result = (ch >= 'a' && ch <= 'z'); 로도 작성 가능
		
		System.out.println(result);
	}
	
	
	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		// 입력받은 값이 1~10 사이의 값인지 확인
		System.out.print("정수를 입력하세요 : ");
		int in = sc.nextInt();
		
		System.out.println("입력한 값이 1~10 사이의 값인가? "  + (in >= 1 && in <= 10));
		System.out.println("입력한 값이 1~10 범위를 벗어나는가? " + (in < 1 || in > 10));
	}
}
