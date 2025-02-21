package com.kh.set;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private int score;
	
	public Student(){ }

	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	// -------------------------------------------------
	// 모든 필드에 담긴 값이 일치하면 동일한 hashCode 반환
	
	@Override
	public int hashCode() {
		// [1] Objects.hash()
//		return Objects.hash(name, age, score);
		// [2] String의 hashCode 이용
		return (name + age + score).hashCode();
	}

	// 현재 객체(this)와 전달받은 객체(obj)의 각 필드값을 모두 비교하여
	// 같으면 true, 하나라도 일치하지 않으면 false 반환
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			
			if(this.name.equals(std.getName())
					&& this.age == std.getAge()
					&& this.score == std.getScore()) {
				return true;
			}
		}
		return false;
	}
	
	
}
