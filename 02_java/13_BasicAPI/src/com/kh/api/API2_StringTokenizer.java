package com.kh.api;

import java.util.StringTokenizer;

public class API2_StringTokenizer {

	/*
	 * java.util.StringTokenizer
	 * * 문자열 내의 특정 구분자로 나눠주는 클래스(토큰화)
	 */
	public static void main(String[] args) {
		
		String data = "안녕하세요|나는정혜영입니다|반갑습니다.";
		
		StringTokenizer st = new StringTokenizer(data,"|");
		
		// *변수명.hasMoreTokens():boolean => 토큰화 가능 여부 체크
		// *변수명.nextToken():String => 분리된(토큰화된) 문자열을 반환
		
		String[] arr = new String[3];
		int idx = 0;
		
		while(st.hasMoreTokens()) {
			arr[idx] = st.nextToken();
			System.out.println(arr[idx]);
			idx++;
		}
	}

}
