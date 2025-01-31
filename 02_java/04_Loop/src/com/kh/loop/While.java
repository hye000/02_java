package com.kh.loop;

public class While {

	/*
	 * [표현식]
	 * 
	 * 
	 *  [초기식]  -> 생략 가능
	 * 	while(조건식){
	 * 		반복적으로 수행할 코드
	 * 
	 *		// [증감식]  -> 생략 가능
	 * }
	 * 
	 * * 실행 순서
	 * 		- 조건식 검사 -> 결과가 true인 경우 { } 안의 코드 수행
	 * 		-> 조건식 검사-> 결과가 true인 코드 수행
	 * 		------------- 계속 반복 ------------------>
	 *  	-> 검사 -> false인 경우 반복문 종료
	 */
	public static void main(String[] args) {
//		method1();
		method2();

	}
	
	public static void method1() {
		// Happy문장 다섯번 출력
		int i = 10;			// 초기식
		while(i>5) {		// 조건식
			System.out.println("Happy");
			i --;			// 증감식
		}
	}

	public static void method2() {
		// class For의 method5를 while문으로 작성
		// 랜덤값을 조회하여 1부터 해당 값까지의 총합
		
		int random = (int)(Math.random()*10 + 1);
		int i=1;
		int total = 0;
		
		while(i<=random) {
			total += i;
			i++;
			// => total += i++; 로 작성 가능
		}
		System.out.println(total);
	}
}
