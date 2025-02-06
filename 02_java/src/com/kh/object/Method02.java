package com.kh.object;

//반환형이 있는 메소드

public class Method02 {

	public static void main(String[] args) {
		System.out.println(add(10, 20));
		// => 출력 : 30
		System.out.println(add(123, 567));
		
		System.out.println(add(55));
		// => 메소드2가 실행됨
		
		divide(50, 7);
		divide(50, 0);
	}							
	
	public static int add(int n1, int n2) {		//메소드1
		return n1+n2;
	}
	//	*메소드 "오버로딩"* => 같은 이름의 메소드를 여러 개 작성하는 것
	//						이 때!
	//						메소드 명이 동일하고, 매개변수 정보가 달라야 함
	//											=> 매개변수 정보 : 자료형(타입), 개수, 순서 / 변수명이 기준이 아님
	
	public static int add(int n1) {		//메소드2
		return n1 + 10;
	}
	
	// 반환형이 다르더라도 메소드명과 매개변수 정보가 같은 경우 오류 발생함
	// => 오버로딩이 적용되지 않음
//	public static double add(int num) {
//	return num;
//	}		
	// ================================================================================
	
	/* 
	 * return의 두가지 의미
	 * i) 반환 값을 돌려준다	=> return 값;
	 * ii) 메소드를 종료시킨다 	=> return;
	 */
	public static void divide(int n1, int n2) {
		// n2 변수의 값이 0인 경우 메소드 종료
		if(n2 == 0 ) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("n1 / n2 = " + (n1/n2));
	}
}
