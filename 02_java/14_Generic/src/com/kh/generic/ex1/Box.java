package com.kh.generic.ex1;


// 제네릭 적용 전
public class Box {
	private Object ob;
	// Object 클래스는 최상위 클래스로, 모든 클래스의 인스턴스를 저장할 수 있다(참조 가능)
	public Object get() {
		return ob;
	}
	
	public void set(Object ob) {
		this.ob = ob;
	}
}

class Apple{
	@Override
	public String toString() {
		return "I'm an apple.";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I'm an Orange.";
	}
}