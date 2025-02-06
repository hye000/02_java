package com.kh.object.ex4;

public class StudentEasy {
	private String name;
	private int age;
	private int math;
	private int eng;
	private int kor;
	// 필드부까지는 작성해야 함
	
	// 생성자 자동완성 단축키 : Alt + Shift + s -> o
	public StudentEasy(String name, int age, int math, int eng, int kor) {
		super();
		this.name = name;
		this.age = age;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}
	// 기본 생성자 : 모두 체크 해제해서 generate
	public StudentEasy() {
		super();
	}
	
	
	// ======================================================================
	// 메소드 getter/setter 자동완성 : Alt + Shift + s -> r
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	
	
	// ========================================================
	// toString() Alt + Shift + s -> s
	@Override
	public String toString() {
		return "StudentEasy [name=" + name + ", age=" + age + ", math=" + math + ", eng=" + eng + ", kor=" + kor + "]";
	}
	
	
}
