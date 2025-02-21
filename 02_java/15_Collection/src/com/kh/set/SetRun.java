package com.kh.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetRun {

	/*
	 * Set 특징
	 * 	- 순서가 없음
	 * 	- 중복이 허용되지 않음
	 * 
	 * 해시(Hash) 알고리즘
	 * 	: 특정 기준에 따라서 데이터를 분류하는 방식(알고리즘)
	 * 
	 * 	- 중복 데이터 판단 : hashCode, equals 메소드
	 * 		[1] hashCode : 기준이 되는 값(데이터)를 정의
	 * 		[2] equals	 : hashCode 값이 같을 경우 동일 데이터를 판단하는 로직을 정의
	 * 
	 * 	- 메소드 정리
	 * 		데이터 추가 : add(데이터)
	 * 		데이터 삭제 : remove(데이터)
	 * 		저장된 데이터 크기 : size()
	 * 		데이터 조회
	 * 		[1] Iterator(반복자) 사용
	 * 			Iterator 객체 생성 : Set변수명.iterator()
	 * 			데이터 유/무 판단	: Iterator변수명.hasNext()
	 * 			데이터 조회 		: Iterator변수명.next()
	 * 		[2] 향상된 for문(for-each)
	 * 			for(Set에지정한타입 변수명 : Set변수명)	{
	 * 				// 변수명을 통해 데이터 접근
	 * 			}
	 */
	
	public static void main(String[] args) {
		// Object
		HashSet hSet1 = new HashSet();
		
		hSet1.add("오늘은 금요일");
		hSet1.add(new String("오늘은 금요일"));
		
		hSet1.add(new String("아메리카노"));
		hSet1.add(new String("라떼"));
		hSet1.add(new String("아메리카노"));
		
		System.out.println(hSet1);
		/*
		 * String
		 * 	-hashCode() : "실제 담긴 문자열"을 10진수 형태로 변환하여 리턴
		 * 	-equals()	: hashCode 결과가 같으면, "실제 담긴 문자열"을 가지고 동등비교하여,
		 * 					일치하면 true, 그렇지 않으면 false 반환
		 */
		
		HashSet<Student> hSet2 = new HashSet<>();
		hSet2.add(new Student("정혜영", 28, 80));
		hSet2.add(new Student("아이유", 32, 90));
		hSet2.add(new Student("정혜영", 28, 80));
		hSet2.add(new Student("마이유", 33, 100));
		
		System.out.println(hSet2);
		
		// hSet2.get() => 인덱스라는 개념이 없기 때문에 사용할 수 없음
		
		// for-each문
		for(Student s : hSet2) {
			System.out.println(s);
		}
		
		// Iterator 반복자를 사용
		Iterator<Student> it = hSet2.iterator();	// Iterator 객체 생성
		
		while(it.hasNext()) {	// 데이터 유/무 확인
			Student s = it.next();	// 데이터 조회
			System.out.println(s.getName());
		}
		
		// Set -> List 변환하는 방법 : addAll() 활용
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(hSet2);
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "번째 : " + list.get(i));
		}
	}

}
