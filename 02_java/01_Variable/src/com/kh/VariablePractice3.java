package com.kh;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		System.out.println("면적 : " + (width * height));
		System.out.println("둘레 : " + (width + height)*2);
	}
}
