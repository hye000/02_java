package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		// 객체 배열을 생성하고 인스턴스 생성하지 않으면 참조하고 있는 게 없기 때문에(null) 어떤 기능(메소드)를 사용할 수 없음
		
		animals[0] = new Dog("초코", "푸들", 4);
		animals[1] = new Dog("우유", "말티즈", 13);
		animals[2] = new Cat("두부", "코리안숏헤어", "공원", "노란색");
		animals[3] = new Dog("가을", "믹스견", 6);
		animals[4] = new Cat("까미", "러시안블루", "가정집", "블루블랙");

		// 배열을 "자료형[] 배열명"으로 선언했다면
		// for-each문에는 for(자료형 변수명 : 배열명)으로 작성
		
		for (Animal a : animals) {
				a.speak();
				// => 컴파일 단계에서는 부모타입(참조변수타입)의 메소드를 가리키지만
				// 	  실행 시에는 생성된 객체(클래스)에서 재정의된 메소드가 실행됨(동적바인딩)
		}
	}
}
