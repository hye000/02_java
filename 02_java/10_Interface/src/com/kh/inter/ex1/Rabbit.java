package com.kh.inter.ex1;

public class Rabbit implements Animal, Baby{
	
	@Override
	public void move() {
		// Baby라 기능 없음...
	}
	
	public void eat() {
		System.out.println("Rabbit이 당근을 먹습니다.");
	}
	
	public void makeSound() {
		System.out.println("...?");
	}
	
}
