package com.kh.api;

public class API2_StringBuilder {

	/*
	 * java.lang.StringBuilder 클래스
	 * * 문자열 값을 변경할 수 있음(=> 같은 메모리 공간에서 값을 변경)
	 */
	public static void main(String[] args) {
	
		// StringBuilder 객체 생성 시 String 타입의 변수 필요
		String str= "Winter";
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb);
		System.out.println(sb.toString());
		
		int hash1 = System.identityHashCode(sb);
		System.out.println(hash1);
		
		// * 값을 변경 : 변수명.append(추가할값)
		sb.append(" is cold.");
		sb.append("T-T");
		
		System.out.println(sb);
		int hash2 = System.identityHashCode(sb);
		System.out.println(hash2);
	}

}
