package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		return (year % 4 == 0) && (year % 100 != 0 || year % 400 ==0);
	}
	
	public long leapDate(Calendar c) {
		
		//1년 1월 1일부터 오늘까지의 총 날 수를 계산
		
		int currYear = c.get(Calendar.YEAR);
		int currMonth = c.get(Calendar.MONTH);
		int currDay = c.get(Calendar.DAY_OF_MONTH);
		
		long days = 0;
		
		// 직전 연도까지 구하기
		// 해당 연도가 윤년이면 +366, 평년이면 +365
		for(int i=1; i<currYear; i++) {
			days += isLeapYear(i) ? 366 : 365;
		}
		
		// 현재 연도부터 구하기
		// 1, 3, 5, 7, 8, 10, 12월인 경우 + 31
		// 4, 6, 9, 11월인 경우 + 30
		// 2월인 경우 해당연도가 윤년이면 + 29, 평년이면 + 28
		for(int i=0; i<currMonth; i++) {
			switch(i) {
			case 1 : case 3 : case 5 : case 7 : case 8: case 10: case 12 :
				days += 31;
			case 4: case 6: case 9: case 11:
				days += 30;
			case 2: days += isLeapYear(i)? 29 : 28; 
			}
		}
		
		days += currDay;

		return days;
	}
}
