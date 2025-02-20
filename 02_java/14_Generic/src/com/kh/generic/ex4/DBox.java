package com.kh.generic.ex4;

// 타입 매개변수는 여러개도 선언 가능함
public class DBox<L, R> {

	private L left;		// 첫 번째로 전달된 타입 사용
	private R right;	// 두 번째로 전달된 타입 사용
	
	// set 메소드 정의
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}
