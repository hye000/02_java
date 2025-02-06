package com.kh.object;

// void test
// 반환 타입 없는 유형

public class Method01 {

	/*
	 * 메소드(Method) : 클래스 내부에 있는 함수(기능)
	 * 
	 * [표현법]
	 * 		접근제한자 예약어 반환형 메소드명(매개변수 정보){
	 * 			// 함수에서 실행할 내용(코드)
	 * 		}
	 */
	public static void main(String[] args) {
		System.out.println("===== 프로그램 시작 ======");
		
		hiEveryone(20);
		// ii) 메소드 호출 : 메소드명(전달값); or 메소드명(); <-매개변수가 없는 경우

		hiEveryone(50);
		
		System.out.println("===== 프로그램 종료 ======");

	}

	public static void hiEveryone(int age) {
		// 반환형 : void (=> 결괏값이 없음을 의미한다)
		// 메소드명 : hiEveryone
		// 매개변수 정보 : 1개, 정수형(int), age 변수
		//	=> 메소드 호출 시 전달되는 값을 저장하는 변수
		System.out.println("===== hiEveryone! =====");
		System.out.println("나이는 : " + age);
	}	// i) 정의는 했지만 아직 호출된 상태는 아님
}
