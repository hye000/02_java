package com.kh.exception;

import java.util.Scanner;

public class Run {

	/*
	 * 	[에러 종류]
	 * 	- 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 => 코드로 해결할 수 없음(심각한 오류)
	 * 	- 컴파일 에러 : 문법 상의 오류 => 빨간 줄로 오류를 파악할 수 있음(eclipse 기준)
	 * 				 (개발자의 실수) -> 발견과 해결이 쉬움
	 * 	- 런타임 에러 : 코드 상의 문제는 없으나 실행 중 발생할 수 있는 오류
	 * 				=> 사용자의 실수 또는 미처 처리하지 못한 기능으로 발생될 수 있음
	 * 	- 논리적 에러 : 문법상 문제 없고, 실행 시에도 문제가 없으나
	 * 				  프로그램의 의도와 맞지 않은 동작이나 결과를 나타내는 오류
	 * 
	 * 	컴파일 에러, 런타임 에러, 논리적 에러와 같은 개발자가 예측 가능하고
	 * 	수정할 수 있는 에러들을 "예외"라고도 표현한다 => Exception
	 * 	
	 * 	이러한 "예외"를 "처리"하는 방법 => 예외 처리
	 * 
	 * 	* 왜 예외처리를 하는가? (예외 처리의 목적)
	 * 	  : 예외 처리를 하지 않을 경우 프로그램이 비정상적으로 종료될 수 있기 때문에
	 * 		프로그램이 정상적으로 실행될 수 있게 하기 위함이다
	 * 
	 * 	* 예외처리 방법
	 * 		1] 직접 처리 : try~catch문 이용 (=> 메소드 구현부)
	 * 		2] 위임(떠넘기기) : throws 이용 (=> 메소드 머리부)
	 * 
	 */
	
	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		try {
			
		System.out.print("a / b . . . a? ");
		int a = sc.nextInt();
		System.out.print("a / b . . . b? ");
		int b = sc.nextInt();
		System.out.printf("%d / %d = %d \n", a, b, a/b);
		} catch(ArithmeticException e) {
			System.out.println("오류 내용 : " + e.getMessage());
		}
		System.out.println("======= method1 종료 =======");
		
	}
}
