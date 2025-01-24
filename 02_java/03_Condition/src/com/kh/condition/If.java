package com.kh.condition;

import java.util.Scanner;

public class If {

	/*
	 * 조건문 if
	 * : 기본적으로 프로그램은 순차적으로 진행됨 (위->아래/ 왼->오)
	 * 	 순차적인 흐름을 바꿀 때 제어문(조건문, 반복문, ...)을 사용하여 제어가 가능하다
	 * -조건문 : 조건에 따라 선택적으로 실행할 때
	 * -반복문 : 반복적으로 실행할 때
	 * 
	 * "조건식"을 통해 참인지 거짓인지 판단하여 그에 해당하는 코드를 실행한다
	 * 		=> 조건식의 결과 : true / false	(논리값)
	 * 		=> 사용되는 연산자 : 비교연산자(> < == >= <= 등), 논리연산자(&& ||)를 주로 사용한다.
	 * 	조건문의 종류 : if, switch
	 * 
	 * if
	 *	1] 단독 if문
			=> 조건식이 true인 경우 실행할 코드 작성, false인 경우 실행되는 내용 없음
	 *	2] if~else문
			=> 조건식이 true인 경우 실행할 코드 작성, false인 경우 else 에서의 코드 실행
	 *	3] if~ else if~ else문
	 		=> 조건식이 true인 경우 실행할 코드 작성, false이면서 다음 조건식에 참인 경우 실행할 코드 작성, 모두다 false일 경우 마지막 else에서 코드 실행
	 */
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();

	}
	
	public static void method1() {
		/* 사용자의 입력값이 1~10 사이의 값인지 확인하여,
		 * 범위를 벗어난 경우 "범위를 벗어났습니다."
		 * 범위 내에 해당한 경우 입력값을 출력
		*/ 
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("1~10 사이의 값을 입력하세요.");
		int num = sc.nextInt();
		
		if(1<=num && num<=10) {
			System.out.println("입력한 값 : " + num);
		} else {
			System.out.println("범위를 벗어났습니다.");
		}
	}
	
	public static void method2() {
		/*
		 * 문자를 입력 받아 소문자인 경우 " 소문자입니다." 출력
		 * 대문자인 경우 "대문자입니다." 출력
		 * 그렇지 않으면 "알파벳이 아닙니다." 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳을 입력하세요.");
		char ch = sc.next().charAt(0);
		
//		System.out.print(ch == 65);
		if(97<= ch && ch<= 122) {
			System.out.println("소문자입니다.");
		}else if(65<= ch && ch <= 90){
			System.out.println("대문자입니다.");
		} else {
			System.out.println("알파벳이 아닙니다.");
		}
	}

	public static void method3() {
		/*
		 * 주민번호를 입력 받아서 남자인지, 여자인지 출력
		 * 단, - 포함 입력 값의 길이가 14가 아닌 경우 "잘못 입력되었습니다" 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요.(-포함)");
		String num = sc.nextLine();
//		char gender = num.charAt(7);
		// 7글자 이하 입력 시 index[7]의 값이 없어서 여기서 오류 발생함
		
		
		/*
		  if(number.length() != 14) {
		  	System.out.println("잘못 입력되었습니다.");
		  } else {
		  	여기서 추출
		  	char gender = num.charAt(7);
		  	if(gender == '2' || gender == '4') {
				System.out.println("여자입니다");
			} else if(gender == '1' || gender == '3'){
				System.out.println("남자입니다.");
			} else {
				System.out.println("잘못 입력되었습니다.");
				}		  
		  }		  
		 */
		if(num.length() == 14) {
			if(num.charAt(7) == '2' || num.charAt(7) == '4') {
				System.out.println("여자입니다");
			} else if(num.charAt(7) == '1' || num.charAt(7) == '3'){
				System.out.println("남자입니다.");
			} else {
				System.out.println("잘못 입력되었습니다.");
				}
		} else {
			System.out.println("잘못 입력되었습니다.");
		}
		
	}
}
