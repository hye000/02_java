package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {}

	public int countAlpha(String s) throws CharCheckException {
		if (s.contains(" ")) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		}
		
		int count=0;
		// 문자열.toUpperCase():String => 문자열의 알파벳을 모두 대문자로 바꿔서 반환
		// 문자열.toLowerCase():String => 문자열의 알파벳을 모두 소문자로 바꿔서 반환
		s = s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			// if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			if ('a' <= ch && ch <= 'z') {
				count++;
			}
		}
		return count;
	}
}
