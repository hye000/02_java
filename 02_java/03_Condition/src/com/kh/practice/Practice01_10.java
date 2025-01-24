package com.kh.practice;

import java.util.Scanner;

public class Practice01_10 {

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

	}

	public static void practice01() {
		// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		// 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 입력 \n2. 수정 \n3. 조회 \n4. 삭제 \n7. 종료 \n메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
			
		case 2:
			System.out.println("수정 메뉴입니다.");	
			break;
			
		case 3:
			System.out.println("조회 메뉴입니다.");	
			break;
			
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
			
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
			
			default : 
				System.out.println("메뉴를 다시 입력해주세요.");
		}
		
	}
	
	public static void practice02() {
		// 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		// 짝수가 아니면 “홀수다“를 출력하세요.
		// 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(0 <= num && num%2 == 0) {
			System.out.println("짝수다");
		} else if(0 <= num && num%2 != 0) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해 주세요.");
		}
	}
	
	public static void practice03() {
		// 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고,
		// 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요
		// (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		// 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		// 불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng;
		double average = (kor + math + eng)/3;
		
		boolean pass = average >= 60 && kor >= 40 && math >= 40 && eng >= 40;
		
		if(pass == true) {
			System.out.printf("국어 : %d \n수학 : %d \n영어 : %d\n합계 : %d\n평균 : %.1f\n축하합니다, 합격입니다!",
						kor,math,eng,total,average);
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public static void practice04() {
		// 수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: case 2: case 12:
			System.out.println(num + "월은 겨울입니다.");
			break;
			
		case 3: case 4: case 5:
			System.out.println(num + "월은 봄입니다.");
			break;
			
		case 6: case 7: case 8:
			System.out.println(num + "월은 여름입니다.");
			break;	
			
		case 9: case 10: case 11:
			System.out.println(num + "월은 가을입니다.");
			break;	
			
			default:
				System.out.println(num + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public static void practice05() {
		// 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		// 로그인 성공 시 “로그인 성공”,
		// 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		// 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		String id = "myId";
		String pwd = "myPassword12";
		
		System.out.print("아이디 : ");
		String userId = sc.next();
		
		System.out.print("비밀번호 : ");
		String userPwd = sc.next();

//		boolean login = (id == userId && pwd == userPwd);
		
		// 문자열 비교 메소드
		// 문자열 .equals("비교할 문자열"또는 변수)	=> true / false
		if(userId.equals(id) && userPwd.equals(pwd)) {
			System.out.println("로그인 성공");
		} else {
			
			if (!(userPwd.equals(pwd))) {
			System.out.println("비밀번호가 틀렸습니다.");
			} else if (!(userId.equals(id))) {
			System.out.println("아이디가 틀렸습니다.");
			}
		}
		
//		switch
		
		
	}
	
	public static void practice06() {
		// 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		// 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능
		// 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		// 비회원은 게시글 조회만 가능합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		switch(grade){
			case "관리자" :
				System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능합니다.");
				break;
			case "회원" :
				System.out.println("게시글 작성, 게시글 조회, 댓글 작성이 가능합니다.");
				break;
			case "비회원" :
				System.out.println("게시글 조회만 가능합니다.");
				break;	
				
				default :
					System.out.println("다시 입력해 주세요.");
				
		}
		

	}

	public static void practice07() {
		// 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		// 저체중/정상체중/과체중/비만을 출력하세요.
		// BMI = 몸무게 / (키(m) * 키(m))
		// BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		// BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		// BMI가 30이상일 경우 고도 비만

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 :");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 :");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		if( bmi < 18.5) {
			System.out.printf("BMI 지수 : %f\n저체중", bmi);
		} else if(18.5<=bmi && bmi < 23) {
			System.out.printf("BMI 지수 : %f\n정상체중", bmi);
		} else if(23<=bmi && bmi < 25) {
			System.out.printf("BMI 지수 : %f\n과체중", bmi);
		} else if(25<= bmi && bmi <30) {
			System.out.printf("BMI 지수 : %f\n비만", bmi);
		} else {
			System.out.printf("BMI 지수 : %f\n고도비만", bmi);
		}
		

	}

	public static void practice08() {
		// 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		// (단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
		//		“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력(+,-,*,/,%) :");
		char oper = sc.next().charAt(0);
		
		if(num1 > 0 && num2 > 0) {
			switch(oper) {
			case '+' :
				System.out.printf("%d %c %d = %d",num1, oper, num2, num1 + num2);
				break;
				
			case '-' :
				System.out.printf("%d %c %d = %f",num1, oper, num2, num1-num2);
				break;
				
			case '*' :
				System.out.printf("%d %c %d = %f",num1, oper, num2, num1*num2);
				break;
				
			case '/' :
				System.out.printf("%d %c %d = %f",num1, oper, num2, (float)num1/num2);
				break;
				
			case '%' :
				System.out.printf("%d %c %d = %f",num1, oper, num2, num1%num2);
				break;	
				
				default : 
					System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
		
		
	}

	public static void practice09() {
		// 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		// 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		// 이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		// 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
	}
}
