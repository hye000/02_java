package com.kh.last.p3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력하시오.");
		System.out.print("년 : ");
		int year = sc.nextInt();   // 1988
		
		System.out.print("월 : ");
		int month = sc.nextInt();  // 9
		
		System.out.print("일 : ");
		int day = sc.nextInt();    // 15
		
		System.out.println("입력된 날짜에 대한 정보는 아래와 같습니다.");
		// 1988년 9월 15일 목요일 << 형식으로 출력
		
		// SimpleDateFormat => 날짜에 대한 포맷 설정 지원 클래스
		String pattern = "yyyy년 MM월 dd일 E요일";
		SimpleDateFormat sdf = 
				new SimpleDateFormat(pattern, Locale.KOREAN);
		// * SimpleDateFormat 객체 생성 시 지역 정보 설정 가능! (=> Locale)
		// * Date 클래스 사용
		Date date = new Date(year-1900, month-1, day);
		String formatDate = sdf.format(date);
		System.out.println(formatDate);
		
		// * GregorianCalendar 클래스 사용
		GregorianCalendar gc = new GregorianCalendar(year, month-1, day);
		String formatDate2 = sdf.format(gc.getTimeInMillis());
		System.out.println(formatDate2);
		
		String result = gc.isLeapYear(year) ? "윤년" : "평년";
		System.out.println(year + "년은 " + result + "이다.");

	}

}
