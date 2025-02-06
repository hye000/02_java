package com.kh.object.practice5.model.vo;

public class Lotto {

	//필드부
	private int[] lotto = new int[6];
	
	//생성부
	
	//기본 생성자 사용
	public Lotto() {
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*46);
			
			// 중복 체크
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	}
	
/*	
 	//초기화 블록
	{
		// 중복하지 않는 1~45까지의 난수들로 배열 초기화(6개)
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*46);
		}
	}
*/
	
	//메소드부
	// 반복문을 이용하여 반복문 출력
	public void information() {
//		for(int i=0; i<lotto.length; i++) {
//			System.out.print(lotto[i]);
//			if(i<lotto.length-1) {
//				System.out.print(", ");
//			}
//		}
		
		// for-each문 : 배열의 첫번째 위치부터 마지막 위치까지 변수를 통해서 접근
		// [표현식] for(자료형 변수명 : 배열명) {} 	=>자료형은 배열의 자료형과 같아야함
		for(int value : lotto) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
