package com.kh.inter.ex1;

public class Dog implements Animal{
	
	@Override
	public void move() {
		System.out.println("Dog가 총총 걸어갑니다");
	}
	
	public void eat() {
		System.out.println("Dog가 사료를 먹습니다.");
	}
	
	public void makeSound() {
		System.out.println("멍멍");
	}

}
