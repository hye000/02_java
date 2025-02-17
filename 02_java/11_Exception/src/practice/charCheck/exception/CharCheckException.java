package com.kh.practice.charCheck.exception;

public class CharCheckException extends Exception{
	// 1) 예외 클래스 상속하기
	// 2) 예외 메시지(detail) 초기화
	//		- 생성자 이용 -> 문자열 값을 전달 받아 부모생성자 호출
	//		- 메소드 이용 -> getMessage 메소드 오버라이딩
	
	public CharCheckException() {}
	
	public CharCheckException(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		return "예외 발생 : 공백이 포함되어 있습니다";
	}
}
