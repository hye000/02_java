package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		boolean isLeap = false;
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 ==0)) {
			isLeap = false;
		}else {
			isLeap = true;
		}
		return isLeap;
	}
	
	public long leapDate(Calendar c) {
		long days;
		
		Calendar now = Calendar.getInstance();	//...?
		Calendar start = Calendar.getInstance();
		
		now.set(2025, 1, 19);
		start.set(1, 0, 1);
		
		long nowDays = now.getTimeInMillis();
		long startDays = start.getTimeInMillis();
		
		days = (nowDays-startDays)/(60*60*1000*24);
//		Date startDate = new Date(1,0,1);
//		Date now = new Date(2025,2,19);
//		
//		int startYear = startDate.getYear();
//		int nowYear = now.getYear();
//		
//		/* 	  해당 현재 연도가 윤년이면 2월을
//			  29일로 평년이면 28일로 더함
//			  월의 날짜 수를 더함			  */
//		 
//		long days = 0;
//		for(int i=startYear; i<nowYear; i++) {
//			if(i % 4 == 0 && (i % 100 != 0 || i % 400 ==0)) {
//				days += 366;
//			}else {
//				days += 365;
//			}
//		}
//		days += now.getDate();
//		
		return days;
	}
}
