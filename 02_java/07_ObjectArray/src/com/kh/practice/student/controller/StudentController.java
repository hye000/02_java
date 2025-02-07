package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

	// ==필드==
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	// ==생성자==
	public StudentController() {
		// *인덱스 위치를 사용하여 초기화
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}	
		// *초기화하여 할당
/*		sArr = new Student[] {
				new Student("김길동", "자바", 100)
				,new Student("박길동", "디비", 50)
				,new Student("이길동", "화면", 85)
				,new Student("정길동", "서버", 60)
				,new Student("홍길동", "자바", 20)
		};
*/
	

	// 객체 배열에 있는 데이터를 반환
	public Student[] printStudent() {	
		return sArr;	// sArr 변수는 생성된 배열 주소를 가지고 있음
	}
	
	public int sumScore() {
		int sum = 0;
		for(int i=0; i<sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] sAverage = new double[2];
		sAverage[0] = sumScore();
		sAverage[1] = sumScore() / sArr.length ;
		
		return sAverage;
	}
	

	
}
