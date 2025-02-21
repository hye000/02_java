package com.kh.list;

import java.util.LinkedList;

public class MyStack {

	private LinkedList<String> arrStack = new LinkedList<>();
	
	public void push(String data) {
		arrStack.add(data);
	}
	
	public String pop() {
		// 리스트가 비어있을 경우 "리스트가 비었습니다." 반환
		if(arrStack.isEmpty()) {
			return "리스트가 비었습니다.";
		} else {
			// 그렇지 않으면 리스트 끝의 데이터를 제거하여 반환
			return arrStack.remove(arrStack.size()-1);
		}
	}
}
