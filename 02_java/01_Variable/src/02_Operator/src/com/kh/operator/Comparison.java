package com.kh.operator;

import java.util.Scanner; 

public class Comparison {

	/*
	 * 비교연산자 (이항 연산자)
	 *  : 두 값을 비교하는 연산자
	 *  : 조건을 만족하면 연산 결과가 true, 그렇지 않으면 false
	 *  
	 *   * 종류 * 
	 *   - 대소 비교 연산자 : < > <= >=
	 *   - 동등 비교 연산자 : == !=
	 *   
	 */
	public static void main(String[] args) {

		//입력받은 두 정수의 값을 비교
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1을 입력하세요");
		int a = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("숫자2를 입력하세요");
		int b = sc.nextInt();
		
		System.out.println("첫번째 숫자와 두번째 숫자는 같은 값인가? " + (a == b));
		System.out.println("첫번째 숫자가 두번째 숫자보다 큰가? " + (a > b));
		System.out.println("첫번째 숫자가 두번째 숫자보다 작은가? " + (a < b));
		System.out.println("두번째 숫자는 짝수인가? " + (b % 2 == 0));
		
		System.out.println("두번째 값은 'A'의 유니코드인가? " + (b == 'A'));
		
		
	}

}
