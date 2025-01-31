package com.kh.loop;

public class Continue {

	/*
	 * 분기문 continue
	 * : continue;가 실행되면 뒤에 있는 구문들은 무시하고
	 * 	증감식(for문) 또는 조건식(while)으로 이동한다
	 */
	
	public static void main(String[] args) {
//		method1();
		method2();

	}

	public static void method1() {
		// 1부터 10까지 정수 중에 짝수 출력
		// => 홀수인 경우 다음 반복문 실행
		
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void method2() {
		// 1부터 100까지 총 합
		// 단, 3의 배수이거나 5의 배수는 합산에서 제외
		
		int total = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0 || i%5 == 0) {
				continue;
			}
			total += i;
		}
		System.out.println(total);
	}
}
