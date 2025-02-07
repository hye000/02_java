package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	// ==필드==
	private StudentController ssm = new StudentController();
	
	// ==생성자==
	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		Student[] sArr = ssm.printStudent();
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}
		System.out.println();
		
		System.out.println("========== 학생 성적 출력 ==========");
		double[] sAverage = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + ssm.sumScore());
		System.out.println("학생 점수 평균 : " + sAverage[1]);
		
		System.out.println();
		
		System.out.println("========== 성적 결과 출력 ==========");
		
		
	}
}
