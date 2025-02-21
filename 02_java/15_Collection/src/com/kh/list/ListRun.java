package com.kh.list;

import java.util.LinkedList;
import java.util.List;

public class ListRun {

	/*
	 * [컬렉션] : 자료구조 개념이 내장되어 있는 클래스 자바에서 제공되는 "자료구조"를 담담하는 "프레임워크"
	 * 
	 * - 자료구조 : 방대한 데이터를 보다 효율적으로 관리할 수 있도록 도와주는 방법들 ㄴ (추가, 삭제, 조회, 정렬, 수정, ...) -
	 * 프레임워크 : 이미 만들어져 있는 틀
	 * 
	 * *배열의 단점 - 크기를 반드시 지정해야 함 => 새로운 값을 더 추가하고자 한다면 새로운 크기의 배열을 만들어서 기존 배열의 값들을
	 * 복사하는 코드가 필요 - 배열 중간 위치에 데이터를 추가하거나 삭제하는 경우 => 매번 데이터의 위치를 이동시켜야 하는 복잡한 코드를 직접
	 * 작성해야 했음
	 * 
	 * *컬렉션의 장점 - 크기를 지정할 필요가 없음. 만약 지정하더라도 추가로 데이터를 더 담을 수 있음 - 중간 위치에 데이터를 추가하거나
	 * 삭제할 때 다른 데이터들의 위치를 변경해 줄 필요가 없다
	 * 
	 */

	public static void main(String[] args) {

		List list = new LinkedList(); // 크기를 지정하지 않아도 됨

		// 데이터 추가 => .add(E e) 끝에 데이터를 추가
		list.add("샘플데이터1");
		list.add(123);
		list.add(5.5);

		System.out.println(list);
		// => 저장한 순서대로 출력됨

		// 데이터 추가 => .add(int index, E e) index 위치에 데이터를 추가
		list.add(1, "샘플데이터2");
		System.out.println(list);

		// 데이터 삭제 => .remove(int index) index 위치의 데이터를 삭제
		list.remove(2);
		System.out.println(list);

		// 데이터 변경 => .set(int index, E e) index 위치의 데이터를 변경
		list.set(1, "샘플2");
		System.out.println(list);

		// 저장된 데이터의 크기 조회 => .size()
		System.out.println("현재 리스트 크기 : " + list.size());

		// 특정 위치의 데이터 조회 => .get(int index)
		System.out.println(list.get(2));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번 위치 : " + list.get(i));
		}
		
		// 전체 데이터 삭제
		list.clear();
		System.out.println(list);
		
		// 리스트가 비어있는지 확인
		list.isEmpty();
		System.out.println("리스트가 비어있는가? : " + list.isEmpty());
	}

}
