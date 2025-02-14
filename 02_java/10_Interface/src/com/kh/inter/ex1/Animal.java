package com.kh.inter.ex1;

// [접근제한자] interface 인터페이스명 {}

public interface Animal {

	// 추상 메소드 => 몸체(구현)가 없는 메소드 == 미완성 메소드
	/* [public abstract] */ public void move();
	public void eat();
	public void makeSound();
}
