package com.kh.inter.ex2;

public class Run {

	public static void main(String[] args) {

		// 도형 정보들을 저장할 배열 생성
		Shape[] shape = new Shape[2];
		shape[0] = new Circle(5);
		shape[1] = new Rectangle(3, 4);

		// 반복문을 사용하여 각 도형의 넓이를 출력
		for (Shape s : shape) {
			if (s instanceof Circle) {
				System.out.print("원의 넓이 : ");
			} else if (s instanceof Rectangle) {
				System.out.print("사각형의 넓이 : ");
			}
			System.out.println(s.calculateArea());
		}

		// [for문 작성 시]
//		for (int i = 0; i < shape.length; i++) {
//			if (shape[i] instanceof Circle) {
//				System.out.print("원의 넓이 : ");
//			} else if (shape[i] instanceof Rectangle) {
//				System.out.print("사각형의 넓이 : ");
//			}
//			System.out.println(shape[i].calculateArea());
//		}
	}
}
