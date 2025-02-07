package com.kh.practice;

public class Student {
	// 이름, 나이, 성별 정보를 관리하는 객체
	
	private String name;
	private int age;
	private char gender;
	
	// 생성자를 통해 값을 전달받아 초기화
	public Student(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
		
		// 학생 정보를 출력하는 메소드
		public void printInfo() {
				System.out.println("학생 정보 : " + name +", " + age + ", "  + gender);
	}

}
