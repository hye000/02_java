package com.kh.loop;

import java.util.Scanner;

public class For {

	/*
	 * 반복문 : 프로그램 흐름을 제어하는 제어문 중 하나로
	 * 		  특정 코드를 반복적으로 수행하는 문법
	 * 
	 * [for문 표현식]
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 		반복적으로 수행할 코드
	 * 	  }
	 * 
	 *  * 초기식 : 반복문이 수행될 때 "최초" 한 번만 실행되는 구문
	 *  * 조건식 : 반복문이 "수행될 조건"을 작성하는 구문
	 *  	- 조건식의 결과가 true일 때 -> { } 안의 코드 수행
	 *  	- 조건식의 결과가 false일 때 -> 반복문 종료
	 *  * 증감식 : 반복문을 제어하는 변수의 값을 증감시키는 구문
	 *  ==> 보통 초기식, 조건식, 증감식에서 사용되는 변수가 동일함
	 *  
	 *  [for문 실행 순서]
	 *  초기식 -> 조건식 검사 -> true인 경우 반복할 코드 수행 -> 증감식
	 *  	-> 조건식 검사 -> true인 경우 반복할 코드 수행 -> 증감식
	 *  	----------------- 계속 반복 ----------------> 
	 *  	-> 조건식 검사 -> false인 경우 -> 반복문 종료
	 *  
	 *  		* 참고 : 초기식, 조건식, 증감식은 생략 가능하나, 세미콜록은 필수 입력
	 *  		- 증감식 생략 : for(초기식; 조건식;) {}
	 *  		- 초기식 생략 : for(; 조건식; 증감식) {}
	 *  		- 조건식 생략 : for(초기식; ; 증감식) {}
	 *  		- 모두 생략 : for(; ;) {}
	 */
			
	public static void main(String[] args) {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
	}
	
	public static void method1() {
//		System.out.println("Happy");
//		System.out.println("Happy");
//		System.out.println("Happy");
//		System.out.println("Happy");
//		System.out.println("Happy");
		
//		for(int i=0; i<5; i++) {
//			System.out.println("Happy");
//		}
		
//		for(int i=1; i<=5; i++){
//			System.out.println("Happy");
//		}
		// 반복문 종료 후 i값을 확인하고자 할 경우
		int i;			// 변수를 먼저 초기화(선언) 하고 반복문 작성
		for(i=0; i<5; i++){
			System.out.println(i + "Happy");
		}
		
		System.out.println(i);
	}
	
	public static void method2() {
		// 반복문을 사용하여 10부터 1까지 출력
		// 공백으로 구분하나 마지막에는 공백 없이 출력하고 싶을 때
		
		for(int i = 10; i >= 1; i--) {
			System.out.print(i);
			if(i > 1) {
				System.out.print(" ");
			}
		}
	}
	
	public static void method3() {
		// 1부터 10까지의 총 합을 구해서 출력
		
		int total = 0;
		for(int i=1; i<=10; i++) {
			total += i;
			System.out.println("i : "+ i + ", total : " + total);
		}
		System.out.println(total);
	}

	public static void method4() {
		// 사용자로부터 1~10사이의 정수를 입력 받아 1부터 입력받은 값까지의 총합 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~10 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(1<=num && num<=10) {	
			int total = 0;
			for(int i = 1; i <= num; i++) {
				total += i;
			}
			System.out.println("1부터 입력한 값까지의 총합 : " + total);			
		} else {
			System.out.println("범위를 벗어난 값이 입력되었습니다.");
		}
	}
	
	public static void method5() {
		// 랜덤값을 조회하여 1부터 해당 값까지의 총합
		
		/*
		 * [랜덤값 구하는 방법]
		 * - Math : java.lang.Math
		 * 			random()
		 * 	=> Math.random() 호출하여 사용
		 * 		0.0 ~ 0.99999999 사이의 random값 출력
		 * (int)(Math.random() * 10 + 1)		1~10 사이의 랜덤값
		 */
		
		int random = (int)(Math.random() * 10 + 1);
		int total = 0;
		
		for(int i=1; i<=random; i++) {
			total += i;
		}
		System.out.println(total);
		
	}
	
	public static void method6() {
		final String STR = "Story";
		// 각 인덱스 별 문자를 한 줄씩 출력하기
		
		for(int i=0; i<STR.length(); i++) {		//index는 길이-1이기때문에 범위를 작게 지정
			System.out.println(STR.charAt(i));
		}
		
	}
	
	public static void method7() {
		// 사용자에게 2~9사이의 정수를 입력받아 해당 단을 출력하기
		// ex) 3 -> 3단 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2~9 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(2<=num && num<=9) {
			for(int i=1; i<10; i++) {
//				System.out.println(num + "x" + i + "=" + (num*i));
				 System.out.printf("%d x %d = %d\n",num,i,num*i);
			}
		} else {
			System.out.println("2~9 사이의 값을 입력해 주세요.");
		}
	}
	
	public static void method8() {
		// 2단부터 9단까지 출력
		
		
		// 세로로 출력
		for(int i=2; i<10; i++) {		// i<10 또는 i<=9 로 작성
			for(int j=1; j<10; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
		
		
		// 가로로 출력
		for(int k=1; k<10; k++) {
			for(int l=2; l<10; l++) {
				System.out.printf("%d x %d = %d\t",l,k,l*k);
			}
			System.out.println();
		}
	}
	
}
