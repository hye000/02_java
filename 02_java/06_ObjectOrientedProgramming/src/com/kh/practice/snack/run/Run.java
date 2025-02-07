package com.kh.practice.snack.run;

import com.kh.practice.snack.model.vo.Snack; 
import com.kh.practice.snack.view.SnackMenu;
import com.kh.practice.snack.controller.SnackController;

public class Run {
	// main 메소드를 가지고 있는 실행을 목적으로 하는 클래스
	public static void main(String[] args) {
		/*
		  MVC패턴
		  	M(Model) 데이터 저장 용도 -> Snack 클래스 담당
		  	V(View) 화면 표시 용도 -> SnackMenu 클래스 담당
		  	C(Controller) 요청을 받아 처리하는 용도 -> SnackController 클래스 담당
		 */
		
		//SnackMenu 객체 생성 후 menu()실행(호출)
		SnackMenu sm = new SnackMenu();
		sm.menu();
	}

}
