package com.kh.practice.snack.view;
	// V(View) 화면에 표시하기 위한 용도의 클래스

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;
//import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	//	필드
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	// 자동 import => ctrl + shift + o 
	// Controller를 통해서 조회나 값을 저장함(처리하는 역할) | Snack객체는 값을 저장하는 곳이라고 보면 됨
	
	//	생성자부 생략 => 기본 생성자만 사용 가능함
	
	//	메소드
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("맛 : ");
		String flavor = sc.next();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		
		// SnackController 객체를 통해서 Snack 객체에 데이터 저장하기
		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);
		//? 저장되었습니다 출력 안 됨 => sysout으로 출력해야 됨
		// 반환되는 것 != 출력되는 것, 반환된 값을 출력해주려면 출력메소드 사용해야 함
		
		System.out.print("저장한 정보를 확인하시겠습니까? (y/n) : ");
		char answer = sc.next().charAt(0);
		// 저장한 정보 확인 안 됨
		
		if(answer == 'y' || answer == 'Y') {
			String data = scr.confirmData();
			System.out.println(data);
		}
	}
}
