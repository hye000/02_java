package com.kh.operator.practice;

import java.awt.print.Printable;
import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
//		practice01();
//		practice02();
//		practice03();
//		practice04();
//		practice05();
//		practice06();
//		practice07();
//		practice08();
		practice09();
//		practice10();
//		practice11();

	}

	public static void practice01() {
		// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1) 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);
		
	}
	
	
	public static void practice02() {
		// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2) 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = (num > 0 ? "양수다" :
						num == 0 ? "0이다" : "음수다");
		
		System.out.println(result);
	}
	
	
	public static void practice03() {
		//키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3) 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = num%2 == 0 ? "짝수다": "홀수다";
		
		System.out.println(result);
	}
	
	
	public static void practice04() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("4) 인원 수 : ");
		int num1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		int result1 = num2/num1;
		int result2 = num2%num1;
		
		System.out.printf("1인당 사탕 개수 : %d \n", result1);
		System.out.printf("남는 사탕 개수 : %d", result2);
		

	}
	
	
	public static void practice05() {
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		// 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
//		이름 : 박신우
//		학년(숫자만) : 3
//		반(숫자만) : 4
//		번호(숫자만) : 15
//		성별(M/F) : F
//		성적(소수점 아래 둘째자리까지) : 85.75
//		3학년 4반 15번 박신우 여학생의 성적은 85.75이다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5) 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
//		sc.nextLine();
//		*** sc.nextLine()을 사용하기 전에만 버퍼 비워주면 됨 ***
		
		System.out.print("반(숫자만): ");
		int cls = sc.nextInt();
//		sc.nextLine();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
//		sc.nextLine();

		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		String genresult = gender == 'M'? "남": "여";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.",grade, cls, num, name, genresult, score);
	}
	
	
	public static void practice06() {
		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "어린이":
						13<age && age<=19 ? "청소년": "어른";
		
		System.out.println(result);
	}
	
	
	public static void practice07() {
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		System.out.println("합계 : " + total);
		
		double average = (kor + eng + math)/3.0 ;
		System.out.printf("평균 : %.1f \n", average);
		
		String result = (kor >= 40 && math >= 40 && math>= 40 && average >= 60)? "합격" : "불합격";
		
		System.out.println(result);
	}
	
	
	public static void practice08() {
		// 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String rNum = sc.nextLine();
		char gender = rNum.charAt(7);	// *** index 0부터 시작 ***
		
		String result = gender == '2' || gender == '4' ? "여자" : "남자";
		System.out.println(result);
	}
	
	
	public static void practice09() {
		// 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		// 그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		// 아니면 false를 출력하세요.
		// (단, num1은 num2보다 작아야 함)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		String result =  num1 < num2 && (num3 <= num1 || num2 < num3)? "true" : "false";
		System.out.println(result);
	}
	
	
	public static void practice10() {
		// 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 3 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3;
		
		System.out.println(result);
		
		
	}
	
	
	public static void practice11() {
		// A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		// 인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
		// (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int anlA = sc.nextInt();
		double incenA = anlA + anlA*0.4;
		String resultA = incenA > 3000 ? "3000 이상" : "3000 미만";
		
		System.out.print("B사원의 연봉 : ");
		int anlB = sc.nextInt();
		double incenB = anlB ;
		String resultB = incenB > 3000 ? "3000 이상" : "3000 미만";
		
		System.out.print("C사원의 연봉 : ");
		int anlC = sc.nextInt();
		double incenC = anlC + anlC*0.15;
		String resultC = incenC > 3000 ? "3000 이상" : "3000 미만";
		
		
				
		System.out.printf("A사원 연봉/연봉+a : %d / %.1f \n", anlA, incenA );
		System.out.println(resultA);
		
		System.out.printf("B사원 연봉/연봉+a : %d / %.1f \n", anlB, incenB);
		System.out.println(resultB);
		
		System.out.printf("C사원 연봉/연봉+a : %d / %f \n", anlC, incenC);
		System.out.println(resultC);
		
	}
	
}
