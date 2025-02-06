package com.kh.object.practice4.model.vo;

public class Student {

	//필드부
	private static int grade = 3;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	//생성부
	public Student() {}
	
	public Student(int grade, int classroom,String name,double height,char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	//메소드부
	// get , set
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	public static int getGrade() {
		return grade;
	}

	public static void setGrade(int grade) {
		Student.grade = grade;
	}

	public void information() {
		System.out.printf("학년 : %d | 반 : %d| 이름 : %s| 키 : %.1f | 성별 : %c\n",
							grade, classroom, name, height, gender);
	}
}
