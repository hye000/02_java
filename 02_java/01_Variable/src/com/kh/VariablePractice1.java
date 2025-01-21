package com.kh;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요 (남/여) : ");
		String gender = sc.next();		// sc.nextLine() => String
		// Scanner 는 문자열 형태로만 입력을 받음 char를 사용하고 싶으면 형변환 해줘야 함
		// .charAt(인덱스값) : 문자열 인덱스 위치의 한 문자를 반환
		// "apple".charAt(3) -> 'l' 출력
		char gen = gender.charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		
		System.out.println("키 " + height + "cm인 " + age + "살 " + gen + "자 " + name + "님 반갑습니다^-^");
		
		// printf 메소드 사용
		// %s -> 문자열 | %c -> 문자 | %d -> 정수 | %f -> 실수
		System.out.printf("키 %.1fcm 인 %d살 %c자 %s님 반갑습니다",		// %f 사이에 %.1f %.2f 를 입력하면 소숫점 자리수 설정 가능
							height, age, gen, name);
	}
}
