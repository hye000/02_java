package com.kh.condition;

import java.util.Scanner;

public class Switch {

	/*
	 * switch
	 * - if문과 동일한 조건문이지만, 동등비교를 통해 흐름을 제어
	 * - 실행할 코드만 실행하고 자동으로 종료되지 않음 => 직접 종료될 수 있게 설정해야함(break)
	 * 
	 * 	switch(비교대상) {		=> 비교대상(변수/식) ---> 정수, 문자, 문자열
	 * 	case 값1 : 	=> 비교대상이 값1과 같다면 실행
	 * 		실행코드;
	 * 	case 값2 :
	 * 		실행코드;
	 * 	...
	 * 	default : 	=> 모든 케이스가 해당되지 않을 때
	 * 		실행코드;
	 * }
	 */
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();

	}

	public static void method1() {
		/*
		 * 정수를 입력 받아
		 * 1: 빨간색
		 * 2: 파란색
		 * 3: 초록색
		 * 그 외 : 잘못입력하셨습니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 사이의 값을 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) { 
		case 1 : 
			System.out.println("빨간색");
			break;
			
		case 2 :
			System.out.println("파란색");
			break;
		
		case 3 : 
			System.out.println("초록색");
			break;
			
		default : 
			System.out.println("잘못 입력하셨습니다.");
		}
		
		/*
		 * [if문으로 작성하면]
		 * 
		 * 	if(num == 1){
		 * 		System.out.println("빨간색");
		 * 	  } else if(num == 2){
		 * 		System.out.println("파란색");
		 * 	  } else if(num == 3) {
		 * 		System.out.println("초록색");
		 * 	  } else{
		 * 		System.out.println("잘못 입력하셨습니다.");
		 * 	}
		 */
	}

	
	public static void method2() {
		/*
		 * 과일을 구매하는 프로그램
		 * 사용자가 구매하고자 하는 과일을 입력하면, 해당 가격을 출력
		 * 
		 * 출력 => [과일이름]의 가격은 [과일가격]원 입니다.
		 * -----------------------------------------
		 * 사과 | 15000
		 * 포도 | 30000
		 * 귤  | 8000
		 * -----------------------------------------
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구매하고자 하는 과일을 입력하세요.");
		String fruit = sc.nextLine();
		int apple = 15000;
		int grape = 30000;
		int mandarin = 8000;
		
		
		switch(fruit) {
			case "사과" :
				System.out.printf("%s의 가격은 %d원입니다.",fruit,apple);
				break;
			
			case "포도" :
				System.out.printf("%s의 가격은 %d원입니다.",fruit,grape);
				break;	
			
			case "귤" :
				System.out.printf("%s의 가격은 %d원입니다.",fruit,mandarin);
				break;
				
			default : 
				System.out.println("찾으시는 과일은 판매하고 있지 않습니다.");
		}
	}

	public static void method3() {
		/*
		 * 월을 입력 받아 해당 월의 말일이 며칠까지인지 출력
		 *
		 * 월을 입력하세요 : 
		 * N월은 N일까지입니다
		 * 
		 * 1,3,5,7,8,10,12 => 31일까지
		 * 4,6,9,11 => 30일까지
		 * 2월 => 28일까지
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : "); 
		
		int month = sc.nextInt();		
		
		switch(month) {	// switch의 조건이랑 case의 값이 같은 자료형이어야 함
		
			case 1, 3, 5, 7, 8, 10, 12 :
				// 이러한 입력은 jdk 14버전부터 지원 됨
				// 원래 오류남
				// case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("%d월은 31일까지입니다.", month);
			break;		
			
			case 4, 6, 9, 11 : 
			System.out.printf("%d월은 30일까지입니다.", month);
			break;	
			
			case 2 : 
			System.out.printf("%d월은 28일까지입니다.", month);
			break;	
			
			default : 
			System.out.println("해당하는 달이 없습니다.");
		}
		
	}
}
