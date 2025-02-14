package com.kh.inter.ex1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// 사용자가 선택한 메뉴에 따라 동물 객체를 크기가 3인 배열에 담기
		// 1.고양이 2.강아지 3.토끼

		Scanner sc = new Scanner(System.in);

		Animal[] arr = new Animal[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("1. 고양이");
			System.out.println("2. 강아지");
			System.out.println("3. 토끼");
			System.out.print("선택 > ");
			int s = sc.nextInt();

			switch (s) {
			case 1:
				arr[i] = new Cat();
				break;
			case 2:
				arr[i] = new Dog();
				break;
			case 3:
				arr[i] = new Rabbit();
				break;
			}
		}

		// [for each문 작성 시]
//		for(Animal a : arr) {
//			a.move();
//		}
		
		// [for문 작성 시]
//		for(int i=0; i<arr.length; i++) {
//			arr[i].move();
//		}
		
		// 배열의 각 위치에 접근하여 move()호출 (단, 아기는 "움직일 수 없습니다" 출력)
		for(Animal a : arr) {
			if(a instanceof Baby) {
				System.out.println("움직일 수 없습니다.");
			} else {
				a.move();
			}
		}
		sc.close();
	}

}
