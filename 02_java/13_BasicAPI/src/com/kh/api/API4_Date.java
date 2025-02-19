package com.kh.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class API4_Date {

	/*
	 * java.util.Date
	 * 날짜, 시간 관련 클래스
	 */
	
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		// => 현재 날짜, 시간 정보를 확인 할 수 있음
		
		// * 원하는 날짜 지정하기
		//	- 연도 : 지정연도-1900
		//	- 월	  : 지정월-1
		
		Date date2 = new Date(2024-1900, 12-1, 31);
		System.out.println(date2);
		
		// java.text.SimpleDateFormat
		// : 형식을 지정하는 객체
		
		String format = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		System.out.println(sdf.format(date));
		
		// java.time.LocalDateTime
		LocalDateTime date3 = LocalDateTime.now();
		// LocalDateTime.now() : 현재 날짜 시간 기준으로 생성
		System.out.println(date3);
		
		// *변수명.getMonth() : 월 정보를 반환(영어)
		System.out.println(date3.getMonth());
		// *변수명.getMonthValue() : 월 정보를 반환(숫자)
		System.out.println(date3.getMonthValue());
		
		// *변수명.getDayOfMonth() : 일 정보를 반환(월 기준)
		System.out.println(date3.getDayOfMonth());
		// *변수명.getDayOfYear() : 일 정보를 반환(연 기준)
		System.out.println(date3.getDayOfYear());
		
		// 올해 며칠이 남았는지?
		System.out.println(365 - date3.getDayOfYear());
		
		// *변수명.getHour() : 시 정보(24시간제)
		System.out.println(date3.getHour());
		
		// 퇴근까지 몇시간 남았는지?
		System.out.println(18 - date3.getHour());
		
		//	*형식지정하기
		//	 java.time.format.DataTimeFormatter 이용
		//	 변수명.format(DateTimeFormatter.ofPattern(형식))
		
		DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		String format2 = date3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
		System.out.println(format2);
	}

}
