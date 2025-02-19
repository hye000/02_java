package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() { }

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		String result = "";

		/* 
		 * [다른 풀이]
		 * StringBuilder sb = new StringBuilder("");
		 * sb.append(st.nextToken());
		 * => StringBuilder 클래스를 사용하여 토큰화 된 문자열 합치기
		 * ===> return sb.toString();
		*/

		while (st.hasMoreTokens()) {
			result += st.nextToken();
		}
		return result;
	}

	public String firstCap(String input) {
		if(input.length() <= 1) return input;
		String result = 
				input.substring(0, 1).toUpperCase() + input.substring(1);
		// 0번 인덱스부터 1-1인덱스까지 = 0번 인덱스값만 추출하며 대문자로 변경
		// 1번 인덱스부터 마지막 위치까지 추출
		return result;
	}

	public int findChar(String input, char one) {
		if(input.indexOf(one) == -1) return 0;
		
		int count = 0;
		
//		for(int i=0; i<input.length(); i++) {
//			if(input.charAt(i) == one) {
//				count++;
//			}
//		}
		
		// * toCharArray():char[] 메소드
		for(char c : input.toCharArray()) {
			if(c == one) {
				count++;
			}
		}

		return count;
	}
}
