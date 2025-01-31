package com.kh.loop;

import java.util.Scanner;

public class DoWhile {

	/*
	 * do~while문
	 * : 처음 무조건 실행 후 조건식 검사
	 * 
	 * [표현식]
	 * 		do {
	 * 			// 반복적으로 수행할 코드
	 * 		} while(조건식);
	 * 
	 * [실행 순서]
	 * { } 안의 코드 수행 -> 조건식 검사 -> true인 경우 { }안의 코드 수행
	 * 				  -> 조건식 검사 -> true인 경우 { }안의 코드 수행
	 * 		------------------- 계속 반복 -------------------->
	 * 				  -> 조건식 검사 -> false인 경우 반복문 종료
	 */
	
	public static void main(String[] args) {
		// 사용자에게 입력받은 정수를 계속해서 더하는 프로그램
		// 단, 사용자가 0을 입력하면 종료
		// 종료 후 최종 합 출력
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num;
		
		do {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			
			// if(num ==0) break;  사용 가능, while(true);
			
			sum += num;
		} while(num != 0);
		System.out.println("총 합 : " + sum);

	}

}
