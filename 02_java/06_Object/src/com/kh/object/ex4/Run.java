package com.kh.object.ex4;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
	/* 
		Student s1 = new Student("정혜영", 27, 93, 86, 60);
		Student s2 = new Student("임수진", 25, 70, 100, 90);
		
		// 첫번째 학생의 평균 출력
		System.out.println(s1.getName() + " 학생의 평균 : " + s1.getAvg());
		System.out.println(s2.getName() + " 학생의 평균 : " + s2.getAvg());
	*/
		
		/*	================================================================================
		 
		 	사용자로부터 이름, 나이, 수학점수, 영어점수, 국어점수를 입력 받아 평균을 구하고 출력하는 프로그램
		 	
		 	ex) 이름 : xxx
		 		나이 : xxx
		 		수학 점수 : xx
		 		영어 점수 : xx
		 		국어 점수 : xx
		 		------------
		 		xxx님의 평균 : xx
		 */
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		
		System.out.print("이름 : ");
		s1.setName(sc.next());
		
		System.out.print("나이 : ");
		s1.setAge(sc.nextInt());
		
		System.out.print("수학 점수 : ");
		s1.setMath(sc.nextInt());
		
		System.out.print("영어 점수 : ");
		s1.setEng(sc.nextInt());
		
		System.out.print("국어 점수 : ");
		s1.setKor(sc.nextInt());
		
		System.out.println(s1.getName() + " 학생의 평균 : " + s1.getAvg());
		
		// Student s1 = new Student(name, age, math, eng, kor);
		// => String name = sc.next(); 저장한 후에 전달
		
	}

}
