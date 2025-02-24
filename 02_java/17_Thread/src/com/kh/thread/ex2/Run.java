package com.kh.thread.ex2;

public class Run {

	public static void main(String[] args) {
		// Thread1 : 20미만의 짝수 출력 (0.2초 동안 대기)
		// Thread2 : 20미만의 홀수 출력 (0.2초 동안 대기)
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName() + " -- end --");

	}

}
