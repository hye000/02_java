package com.kh.object.ex5;

public class Run {

	public static void main(String[] args) {
		System.out.println("count : " + Person.count);
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		
		System.out.println(p1.toString());
		
		Person p2 = new Person("아이유", 30);
		System.out.println(p2.toString());
		
		System.out.println(Math.PI);
		System.out.println((int)(Math.random()* 10 + 1));
		
		Person p3 = new Person();
		System.out.println(p3.toString());
		
		System.out.println("count : " + Person.count);
	}

}
