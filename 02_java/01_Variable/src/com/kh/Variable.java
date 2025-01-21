package com.kh;

public class Variable {
	// 자바 실행 시 꼭 필요한 메소드 : main
	public static void main(String[] args) {
		// printVariable();
		declareVariable();
	}
	
	public static void declareVariable() {
		/*
		 * 변수 선언 : 값을 기록하기 위한 변수를 메모리 공간에 할당(확보)
		 * 
		 * [표현식] 자료형 변수명;
		 * - 자료형 : 변수의 크기 및 모양을 지정하는 부분
		 * - 변수명 : 변수의 이름을 부여하는 부분
		 * * * * * * 
		 * 명명규칙
		 * 1] camelCase : 소문자로 시작하고 다른 단어가 붙을 때 대문자로 시작하는 방법
		 * 		=> 클래스명은 대문자로 시작함
		 * 2] 영문은 대소문자를 구분함
		 * 3] 숫자로 시작할 수 없음
		 * 4] 예약어는 사용할 수 없음
		 * 5] 특수문자는 _ $만 사용 가능하다
		 * * * * * *
		 * 주의사항
		 * 	- 같은 영역 안({중괄호 안})에서는 동일한 변수명으로 선언 불가하다
		 * 	- 해당 영역 안에서 선언된 변수는 그 영역 안에서만 사용 가능
		 */
		
		int num = 10;
		int num2 = 20;
		
		// 1. 논리형 (boolean) : 논리값(true/false) 1byte
		boolean isTrue = true;
		boolean isFalse = false;
		
		isTrue = 1 + 3 > 1;
		isFalse = 2 + 3 < 0;
		System.out.println(isTrue);
		System.out.println(isFalse);
		
		// 2. 숫자 (정수형/실수형)
		// 2-1) 정수형 : 딱 떨어지는 수. 소숫점 x
		// 		byte(1byte) short(2byte) *int(4byte) long(8byte)
		byte bNum;	// byte : -128 ~ 127
		bNum = -128;
//		bNum = 1000;	// 범위를 벗어나면 오류 발생 => byte형 = int형이기 때문
		
		// 2-2) 실수형 : 소숫점 o
		//		float(4byte) *double(8byte)
		float fNum = 0.0f;	// 0.0만 쓰면 double형으로 인식함, 소숫점 7자리까지 표현이 가능하다
							// 값 자체(리터럴)를 저장할 때 값 뒤에 f를 붙여준다
		double dNum = 0.0;	// 소숫점 15자리까지 표현이 가능하며, 실수형의 기본 자료형이다.
		
		// 3. 문자형 (char / String)
		// 3-1) 문자 : char(2byte)
		char ch = 'a';
		char kim = '김';
		
		// 3-2) 문자열 : String(참조자료형)
		String str;
		str = "문자열입니다...";
		System.out.println(str.length());
		
		// 상수 : 변하지 않는 값을 저장하는 공간
		// [표현식] final 자료형 변수명;
		
		// todo : 나이를 저장하기 위한 상수 age 선언하기
		final int AGE;
		AGE = 20;
//		AGE = 25;	// 값이 한 번 저장된 이후에 변경 불가능 (재할당 불가능, const와 유사)
		
		System.out.println(Math.PI);	//대표적인 상수 Math.PI
		
		// [참고]
		int sample = 123_456_789;	// 가독성을 위한 3자리마다 _ 표시 가능! , 안 됨
		System.out.println(sample);

	}
	
	public static void printVariable() {
//		System.out.println(num);
		/*
		 * 변수의 목적? 
		 *  - 데이터(값)를 저장하기 위한 공간
		 *  - 가독성 증가 (변수의 이름을 의미있게 지어주어야함)
		 *  - 재사용성 증가 (한번 값을 저장하면 필요할 때마다 변수 이름으로 가져다가 사용)
		 *  - 유지보수 용이 (한번 저장해 놓으면 해당 위치의 값을 변경)
		 */
		
		//월급계산 = 시급 x 근무시간 x 근무일수
		// *출력 형식* ---> 이름 : 0000원
		// * 2025 최저시급 : 10030원
		
		System.out.println("정혜영 : " + (10030*6*14) + "원");
		System.out.println("카리나 : " + (10030*8*14) + "원");
		System.out.println("닝닝 : " + (10030*5*14) + "원");
		System.out.println("민지 : " + (10030*9*14) + "원");
		
		// 변수를 사용한다면 . . .
		int pay = 10030;	//정수 자료형(int) pay 변수에 10030 값을 대입(저장)
		int time = 8;
		int day = 14;
		
		System.out.println("------------------------------------------");
		
		System.out.println("정혜영 : " + (pay*6*day) + "원");
		System.out.println("카리나 : " + (pay*time*day) + "원");
		System.out.println("닝닝 : " + (pay*5*day) + "원");
		System.out.println("민지 : " + (pay*9*day) + "원");
	}
}
