package com.kh.generic.ex4;

public class Run {

	public static void main(String[] args) {
		DBox<String, Integer> b1 = new DBox<>();	// == new DBox<String, Integer>(); 
		b1.set("Test1", 100);
		// b1.set(100, "Test2");	=> 오류 발생
		System.out.println(b1);	// b1.toString();
		
		DBox<Double, Boolean> b2 = new DBox<>();
		b2.set(12.34, false);
		System.out.println(b2);
	}

}
