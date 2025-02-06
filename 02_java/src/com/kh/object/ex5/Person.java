package com.kh.object.ex5;

public class Person {

	/*
	 	static : "고정적인", "정적인"이라는 의미를 가진다.
	 	static변수, static메소드는 정적메모리를 사용하여 프로그램 실행 시점에
	 	객체 생성없이 메모리에 생성되며 모든 객체가 공유하여 사용할 수 있다.
	 	
	 	*클래스 변수(static으로 선언된 변수)
	 	 => 한 클래스에서 공통적인 값을 유지해야 할 때 사용
	 		클래스명.변수명 으로 사용 가능하고, 
	 		참조변수명.클래스변수명 으로도 사용 가능하다
	 		
	 		
	 	*클래스 메소드(static으로 선언된 메소드)
	 	 => 인스턴스 변수를 사용할 수 없음
	 	 	따라서, 인스턴스와 관계 없는 메소드다
	 	 	단순한 기능(인스턴스 생성 없이 제공하고자 할 경우)
	 	 	클래스명.메소드명 / 참조변수명.메소드명 으로 호출 가능하다
	 */
	
	String name;		//이름
	int age;			//나이
	static int count = 0;	//인스턴스 생성 시 개수
	
	public Person() {
		count++;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		
		this.count++;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " | 나이 : " + age + " | 번호 : " + count;
	}
	
	
	
}
