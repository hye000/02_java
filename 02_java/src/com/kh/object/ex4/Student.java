package com.kh.object.ex4;

/*
 	학생 정보(Student)
 	- 이름		-name:String
 	- 나이		-age:int
 	- 수학 점수	-math:int
 	- 영어 점수	-eng:int
 	- 국어 점수	-kor:int
 	=> 데이터의 경우 직접 접근을 허용하지 않고 간접적으로 접근할 수 있도록 정의(get/set 필요)
 	=> 모든 데이터를 매개변수로 받아서 초기화하면서 객체를 생성할 수 있는 생성자 정의
 */
public class Student {

	// --------------- 필드부(변수 영역) ---------------
	private String name;
	private int age;
	private int math;
	private int eng;
	private int kor;
	
	// ------------------ 생성자부 -----------------
	public Student() {}	// 기본 생성자
	
	// 매개변수를 통해서 값을 전달받아 필드부 변수에 저장함
	public Student(String name, int age, int math, int eng, int kor) {
		this.name = name;
		this.age = age;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}
	
	// ----------------- 메소드부(기능 영역) ------------------
	
	// get
	public String getName() {
		return name;	//this.name 도 가능
	}
	// set
	public void setName(String name) {
		this.name = name;	//인스턴스변수(클래스 내 변수)에 전달받은 값(매개변수로)을 저장
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}

	public String toString() {
		return "name : " + name + " | age : " + age + " | math : " + math + 
				" | eng : " + eng + " | kor : " + kor ;
	}
	
	// 모든 과목의 평균을 계산하는 메소드
	public double getAvg() {
		// 평균 = 총합 / 개수
		return (math + eng + kor) / 3;
	}
	
}
