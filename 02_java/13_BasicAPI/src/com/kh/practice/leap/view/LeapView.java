package com.kh.practice.leap.view;

import java.time.LocalDateTime;
import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	private LeapController lc = new LeapController();
	private Calendar c = Calendar.getInstance();
	
	public LeapView() {

		LocalDateTime now = LocalDateTime.now();
		int mon = now.getYear();

		boolean leap = lc.isLeapYear(mon);

		if(leap) {
			System.out.println(mon + "년은 평년입니다.");
		}else {
			System.out.println(mon + "년은 윤년입니다.");
		}
		
		long date = lc.leapDate(c);
		System.out.println("총 날짜 수 : " + date);
	}

}
