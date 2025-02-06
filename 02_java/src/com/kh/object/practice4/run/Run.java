package com.kh.object.practice4.run;

import com.kh.object.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student std1 = new Student();
		
//		System.out.println(Student.grade);		=> private이라 볼 수 없음
		std1.setClassroom(9);
		std1.setGender('여');
		std1.setHeight(161.3);
		std1.setName("정혜영");
		std1.information();
		
		Student std2 = new Student();
		std2.setGrade(1);
		std2.setClassroom(3);
		std2.setGender('남');
		std2.setHeight(178.1);
		std2.setName("홍길동");
		std2.information();
		
		Student std3 = new Student(2, 12, "김지원", 167.8, '여');
		std3.information();
	}

}
