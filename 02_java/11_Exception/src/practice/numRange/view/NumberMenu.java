package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		NumberController nc = new NumberController();
		try {
			boolean result = nc.checkDouble(num1, num2);
			System.out.printf("%d은(는) %d의 배수인가? %b", num1, num2, result);
		} catch (NumRangeException n) {
			n.printStackTrace();
		}
	}
}
