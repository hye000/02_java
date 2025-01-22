package com.kh.operator;

public class Aithmetic {

	/*
	 * 산술연산자 (이항연산자)
	 * => + - * / &
	 * 
	 * 우선순위 : * / % -> + - 
	 */
	public static void main(String[] args) {
//		method1();
		method2();
		
	}
	
	public static void method2() {
		int a = 5;
		int b = 10;
		
		int c = (++a) + b;	// a6 b10 c16
		int d = c / a;		// c16 a6 / d2 
		int e = c % a;		// c16 a6 / e4
		int f = e++;		// f4 / e5
		int g = (--b) + (d--);	// b9 d2 g11 / d1
		int h = 2;	// h2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		
		// a6+b10 / c15/f4 * g11-d2 % e6+h2
		// 
		
		System.out.printf("a: %d, b: %d:, c: %d, e: %d, f: %d, g: %d, h: %d, i: %d",
						a, b, c, d, e, f, g, h, i);
		// 7, 9, 15, 4, 10, 2, 6, 2, 
		
	}
	
	public static void method1() {
		int n1 = 10;
		int n2 = 3;
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));
		System.out.println("n1 * n2 = " + (n1 * n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 % n2 = " + (n1 % n2));
		
		// 나머지 연산자 (%) -> 짝수/홀수 판별할 때 주로 사용
		// (변수 % 2 == 0) --> 짝수
		// (변수 % 2 != 0) --> 홀수
		// => !(변수 % 2 == 0) 의 짝수 자체를 부정하는 형태도 가능함.
		
		System.out.printf("n1의 값은 짝수인가? %b \n", (n1 % 2 == 0));
		System.out.printf("n2의 값은 짝수인가? %b \n", (n2 % 2 == 0));
		
	}
}
