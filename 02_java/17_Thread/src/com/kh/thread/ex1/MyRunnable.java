package com.kh.thread.ex1;

// Runnable 인터페이스 구현
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		int n1 = 5;
		int n2 = 3;
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1+n2));
		
	}

	
}
