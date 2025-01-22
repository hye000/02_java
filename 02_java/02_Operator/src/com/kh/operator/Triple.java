package com.kh.operator;

import java.util.Scanner;

public class Triple {

	/*
	 * 삼항연산자 (항이 3개인 연산자)
	 * 		(조건식)? (true일 때 결과값이나 식): (false일 때 결과값이나 식);
	 * 
	 */
	public static void main(String[] args) {
//		method1();
		method2();
	}
	
	public static void method2() {
		// 사용자에게 2개의 정수와 + 또는 - 값을 입력받아 연산 결과를 출력
		// 입력 예 ) 10 20 +
		// 단, + 또는 - 외에 문자가 입력되었을 경우 "입력이 잘못되었습니다"라고 출력
		
		System.out.println("아래와 같이 입력 시 연산 결과를 확인할 수 있습니다.");
		System.out.println("예) 10 20 + 입력 시 10 + 20 = 30의 결과 확인 가능");
		System.out.print(" : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		sc.nextLine();
		
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		char ch = sc.next().charAt(0);
		
		int result = (ch == '+')? num1+num2: num1-num2;
		System.out.println(result);
	}
	
	
	public static void method1() {
			// 입력한 값이 x인 경우 "종료합니다" 출력, 그렇지 않으면 "계속 진행합니다" 출력
		System.out.print("종료를 원할 경우 x를 입력하세요");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		String result = (ch == 'x' || ch == 'X')? ("종료합니다") : ("계속 진행합니다");
		System.out.println(result);
		
		}
}
