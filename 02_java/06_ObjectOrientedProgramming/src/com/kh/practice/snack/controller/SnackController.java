package com.kh.practice.snack.controller;
// C(Controller) 화면(view)으로부터 전달 받은 요청에 대한 처리용 클래스

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {

	//	필드
	private Snack s = new Snack();
	// Snack이라는 타입으로 객체를 생성
	
	//	생성자
	public SnackController() {}
	
	//	메소드
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		// 데이터를 setter를 이용해 저장하고,
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		// 저장완료 되었다는 결과를 반환하는 메소드
		return "저장 완료되었습니다.";
	}
	public String confirmData() {
		// 저장된 데이터를 반환하는 메소드
		// => 데이터를 Snack 객체에 저장했음. 따라서, Snack 객체를 통해서 저장된 데이터를 반환해주면 됨
		return s.information();
	}
	
}
