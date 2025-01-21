package com.kh;

import java.util.Scanner;	// Scanner import(연결)

public class VariablePractice0 {	// class를 정의한 부분
	
	public static void main(String[] args) {
		/*
		 * (1) 아래 코드를 변수를 사용하여 실행
		 */
		
		System.out.println("1) 현재 2025년이고 올해 20살입니다.");
		// 매년 출력한다면 어떤 부분을 변수로 사용할지?
		int thisYear = 2025;
		int age = 20;
		
		// println 메소드 사용
		System.out.println("2) 현재 " + thisYear + "년이고 올해 " + age +"살입니다.");
		// printf 메소드 사용 => printf("형식%s%d", 사용할값, 사용할값,...);
		System.out.printf("3) 현재 %d년이고 올해 %d살입니다.\n", thisYear, age);	// thisYear,age 지시어 순서대로 사용해줘야함
		
		
		System.out.println("1) 몸무게가 80kg 이상인 경우 탑승하지 못합니다.");
		final int WEIGHT = 80;
		// println 메소드 사용
		System.out.println("2) 몸무게가 " + WEIGHT + "kg 이상인 경우 탑승하지 못합니다.");
		// printf 메소드 사용
		System.out.printf("3) 몸무게가 %dkg 이상인 경우 탑승하지 못합니다.\n",WEIGHT);	// printf는 줄바꿈 처리 안 해주기 때문에 \n 추가해줌
		
		System.out.println("--------------------------------------------------------");
		
		/*
		 * 입력을 받기 위한 기능을 포함한 클래스 : Scanner
		 * 1) 연결 : import 전체클래스명;		패키지경로.클래스명
		 * 			import java.util.Scanner;
		 * 2) 생성 : new 생성자;
		 * 			new Scanner(System.in);
		 */
		Scanner sc = new Scanner(System.in);	// 생성 및 할당
		System.out.print("이름 : ");
		// sc.nextLine();	//입력한 값을 임시공간에 저장해 놓고 변수에 대입하는 순간 메모리로 이동시켜줌.
		String name = sc.nextLine();
		System.out.println(name + "님 안녕하세요.");
		
		// 나이를 입력받아 출력
		System.out.print("나이 : ");
		int age2 = sc.nextInt();
		System.out.println(age2 + "살 입니다.");
		
		sc.nextLine(); //버퍼 비워줌. \n이 남아있기 때문에
		// 비워주지 않으면 나이만 출력된 뒤 남아있는 \n이 다음에 출력됨.
		// sc.nextLine()은 개행을 기준으로 출력하기 ㄸㅐ문에 남아있던 \n이 출력되면서 입력이 완료된 것이라고 생각함
		
		System.out.print("하고 싶은 말 : ");
		String temp = sc.nextLine();
		System.out.println(temp);
	}
}
