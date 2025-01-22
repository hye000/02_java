package com.kh.operator;

public class InDecrease {

	/*
	 * 증감연산자 (단항 연산자)
	 * ++ : 값을 1씩 증가시키는 연산자
	 * -- : 값을 1씩 감소시키는 연산자
	 * 
	 * 	* 처리 순서  : 다른 연산자가 있을 경우 *
	 * 	 -(증감연산자)변수 : 전위연산 => 선 증감 후 처리
	 * 					++변수, --변수
	 *   -변수(증감연산자) : 후위연산 => 선 처리 후 증감
	 *   				변수++, 변수--
	 */
	
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();
	}

	
	public static void method3() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int r1 = a++;
		System.out.printf("1) a : %d, b : %d, c : %d, r1 : %d \n", a, b, c, r1);
		// a11 b20 c30 r1 10
		
		int r2 = (++a) + (b++);
		System.out.println("2) " + r2);
		// a12 b20 r2 32 . b21
		
		int r3 = (a++) + (--b) + (--c);
		System.out.println("3) " +r3);
		// a12 b20 c29 r3 61 . a13
		
		System.out.printf("4) a : %d, b : %d, c : %d\n", a, b, c);
		// a13 b20 c29
	}
	
	
	public static void method2() {
		int num1 = 20;
		int result1 = ++num1 * 3;
		
		System.out.printf("num1의 값 : %d, result1의 값 : %d\n", num1, result1);
		
		int num2 = 20;
		int result2 = num2++ * 3;
		System.out.printf("num2의 값 : %d, result2의 값 : %d\n", num2, result2);
		// 21 60
	}
	
	
	public static void method1() {
		int num1 = 10;
		
		System.out.println("num1의 값 : " + num1);
		System.out.println("전위연산 1회 수행 : " + (++num1));	// num1의 값 11이기 때문에
		System.out.println("후위연산 1회 수행 : " + (num1++));	// 여기서 출력할 땐 11, 출력하고 나서 num1의 값은 12가 됨
		System.out.println("최종 num1 : " + num1);
	}
}
