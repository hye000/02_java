package com.kh.practice;

import java.util.Scanner;

public class ObjectArrayRun {

	/*
	 	객체 배열 : 여러 개의 객체를 관리하는 구조
	 	배열인데 담고 있는 데이터가 객체라고 보면 됨
	 	
	 	[선언]
	 		클래스명[] 변수명;
	 	[할당]
	 		변수명 = new 클래스명[배열크기];
	 	[인덱스 위치에 초기화]	=>	해당 인덱스 위치에 객체를 생성하여 할당
	 		변수명[인덱스] = new 클래스명();
	 */
	public static void main(String[] args) {
		// 크기가 3인 정수형 배열 선언 및 할당
		int[] intArr = new int[3];
		// 반복문을 사용하여 1부터 3까지 저장
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = i+1;
			System.out.print(intArr[i] + " | ");
		}
		
		// 객체 배열
		// 학생 정보를 담을 객체 배열 선언 및 할당
		// 1] 학생 정보를 관리하기 위해 Student 클래스 추가(정의)
		// 2] 정의한 Student 객체를 사용하여 배열 및 선언 할당
		Student[] stdArr = new Student[2];		// null | null |
		stdArr[0] = new Student("정혜영", 27 , 'F');	// 0x123 | Student 객체 | null | 0|
		stdArr[1] = new Student("홍길동", 20 , 'M');
		
		// 저장된 학생 정보 출력
		stdArr[0].printInfo();	//첫번째 학생 정보 출력
		// 두번째 학생 정보를 제거
		stdArr[1] = null;	// 참조하지 않게 됨
		
		//------------------------------------------------------------------------
		// 입력 받은 값으로 학생 정보 관리
		Student[] sArr = new Student[2];
		Scanner sc = new Scanner(System.in);
		
		// 반복문을 사용하여 입력된 정보를 배열에 저장
		for(int i=0; i<sArr.length; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();	
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			
			sArr[i] = new Student(name, age, gender);			
		}
		
		// 객체 배열을 for-each문으로 사용한다면?
		// for(자료형 변수명 : 배열명) {}
		for(Student s : sArr) {
			s.printInfo();
		}
//		System.out.println(sArr[i]);
	}

}
