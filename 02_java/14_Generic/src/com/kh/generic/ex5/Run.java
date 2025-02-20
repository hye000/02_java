package com.kh.generic.ex5;

public class Run {

	public static void main(String[] args) {

		GenericMethod.<Double>test(777.7);
		
		GenericMethod.<Integer>test(123);
		
		GenericMethod.<String>test("hmm");
		
		GenericMethod.<Character>test('a');
		// 메소드를 사용할 때 타입을 지정
		
		GenericMethod gm = new GenericMethod();
		gm.test("abc");
		gm.test(10);
	}

}

class GenericMethod{
	
	// * 제네릭 메소드
	//		: 특정 메소드 내에서 타입을 전달 받아 적용
	
	/*	// 타입 매개변수 선언 <T>
	 * 	접근제한자 [예약어] "<T>" 반환형 메소드명(매개변수정보){
	 * 		
	 * 		}
	 * 	=> T라는 변수를 사용해서 매개변수타입, 반환타입, 지역변수타입으로 사용 가능
	 */

	public static <T /*extends Number*/> void test(T n) {
		// Number 클래스 타입과 상속 관계인 타입만 전달할 수 있도록 제한
// xxx	T data = (T)n;
		System.out.println(n);
	}
}
