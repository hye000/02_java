package com.kh.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {

	/*
	 * List 특징 : 순서가 있고, 중복이 가능한 컬렉션 - ArrayList : 배열 기반의 구조 데이터 조회가 빠름 데이터 추가/삭제 시
	 * 내부로직 복잡하여 오래 걸림
	 * 
	 * - LinkedList : 리스트 기반의 구조 데이터의 추가/삭제가 빠름 데이터 조회가 느림
	 * 
	 * *메소드 - 데이터 추가 : add(데이터) - 데이터 삭제 : remove(인덱스) - 데이터 조회 : get(인덱스) - 데이터 수정
	 * : set(인덱스, 변경할데이터) - 저장된 데이터 크기 : size()
	 * 
	 */

	public static void main(String[] args) {
//		arrayListTest();
//		linkedListTest();
//		stackTest();
		queueTest();

	}

	public static void arrayListTest() {
		// 문자열 데이터를 관리하는 ArrayList 객체 생성
		List<String> list = new ArrayList<>();
//		ArrayList<String> list = new ArrayList<>();

		// ["헤이즐넛", "아메리카노", "카모마일"]
		list.add("헤이즐넛");
		list.add("아메리카노");
		list.add("카모마일");

		System.out.println(list);

		// 아메리카노 추가(중복)
		list.add("아메리카노");
		System.out.println(list);

		// 첫번째 아메리카노 데이터 삭제
		list.remove(1);
		System.out.println(list);

		// 카모마일 -> 유자차 변경
		list.set(1, "유자차");
		System.out.println(list);

		// {i}번째 {데이터값}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "번째 : " + list.get(i));
		}
	}

	public static void linkedListTest() {
		// 사용자에게 개수를 입력 받아 해당 개수만큼
		// 랜덤값을 추출하여 리스트에 저장

		// {i}번째 : {랜덤값}
		// 랜덤값 범위 : 1 ~ 입력받은 값
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList();

		System.out.print("리스트 길이를 입력하세요 : ");
		int len = sc.nextInt();

		// 값 저장
		for (int i = 0; i < len; i++) {
			int random = (int) (Math.random() * len + 1);
			list.add(random); // int -> Integer (오토박싱)
		}

		// 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "번째 : " + list.get(i));
		}

	}

	public static <E>void printItem(List<E> list) {
		// ArrayList 또는 LinkedList ---> List 부모 타입
		// ArrayList<String> LinkedList<Integer>
		 for(int i=0; i<list.size(); i++){
		 System.out.println(i + "번째 : " + list.get(i));
		 }
	}
	
	public static void stackTest() {
		/*
		 * 스택(Stack) : LIFO(Last In First Out)
		 * 				가장 마지막에 저장된 데이터가 제일 처음에 꺼내올 수 있는 구조
		 * - 데이터 추가 : 끝에 추가
		 * - 데이터 제거 : 마지막 위치부터 제거
		 * 	
		 * -----------------
		 * 		My Stack
		 * -----------------
		 * - arrStack:LinkedList<String> = new LinkedList<>();
		 * -----------------
		 * + push(data:String):void // 데이터 추가
		 * + pop():String 			// 데이터 제거
		 * 							// isEmpty() => 리스트가 비어있다면 "리스트가 비어있습니다" 반환
		 * 							// remove() => 해당 위치의 데이터 제거 후 데이터를 반환
		 */
		MyStack stack = new MyStack();
		
		// 데이터 추가
		stack.push("아보카도");
		stack.push("딸기");
		stack.push("복숭아");
		
		// 데이터 제거
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
	public static void queueTest() {
		/*
		 * 큐(Queue) : FIFO(First In First Out)
		 * 			   처음 저장된 데이터를 가장 먼저 꺼내올 수 있는 구조
		 * 	- 데이터 추가 : 끝에 추가
		 * 	- 데이터 제거 : 처음 위치부터 제거
		 * 
		 * -----------------
		 * 		MyQueue
		 * -----------------
		 * -queue:ArrayList<String>=new ArrayList<>()
		 * -----------------
		 * +enQueue(data:String):void
		 * +deQueue():String
		 * -----------------
		 */
		MyQueue queue = new MyQueue();
		
		// 데이터 추가
		queue.enQueue("아몬드봉봉");
		queue.enQueue("민트초코");
		queue.enQueue("애플민트");
		
		// 데이터 제거
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}
