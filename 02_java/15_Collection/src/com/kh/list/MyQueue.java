package com.kh.list;

import java.util.ArrayList;

public class MyQueue {

	private ArrayList<String> queue = new ArrayList<>();
	
	public void enQueue(String data) {
		queue.add(data);
	}
	
	public String deQueue() {
		if(queue.isEmpty()) {
			return "리스트가 비었습니다.";
		} else {
			return queue.remove(0);
		}
	}
}
