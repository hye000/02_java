package com.kh.practice.student.model.vo;

public class Student {

	// ===필드===
	private String name;
	private String subject;
	private int score;
	
	// ===생성자===
	public Student() {}

	public Student(String name, String subject, int score) {
		super();
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	// ===getter, setter===
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String inform() {
		return String.format("이름 : %s / 과목 : %s / 점수 : %d", name, subject, score);
	}
	
	
}
