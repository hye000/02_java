package com.kh.object.practice1.run;

import com.kh.object.practice1.model.vo.Member;
// 패키지 경로가 다른 클래스이므로 import해야함, 안 하면 오류
public class Run {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.changeName("정혜영");
		m1.printName();

		Member m2 = new Member();
		m2.changeName("김지원");
		m2.printName();
	}

}
