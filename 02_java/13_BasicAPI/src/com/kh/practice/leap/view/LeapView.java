package com.kh.practice.leap.view;

import java.time.LocalDateTime;
import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	private LeapController lc = new LeapController();

	
	public LeapView() {

		Calendar c = Calendar.getInstance();
		// 특정 연도에 대하여 설정하고자 할 경우 set메소드 사용
		// set(필드명, 설정값)
		// c.set(Calendar.YEAR, 2019);
		
		int year = c.get(Calendar.YEAR);
		// 현재 연도 출력

		System.out.printf("%d년은 %s입니다.\n",year, lc.isLeapYear(year)? "윤년": "평년");
		System.out.printf("총 날짜 수 : %d\n",lc.leapDate(c));
	}

}
