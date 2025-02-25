package com.kh.last.p1;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[6];
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
			// 1~100까지 랜덤값 추출하여 배열에 저장
		}

		System.out.println("할당된 배열의 크기 : " + arr.length);
		print(arr);
		// ArrayTest at = new ArrayTest(); => static 예약어 추가 안 하고 메소드 호출하는 법
		System.out.println("가장 큰 값 : " + max(arr));
		System.out.println("가장 작은 값 : " + min(arr));
		System.out.println("짝수의 개수 : " + evenCount(arr) + "개");
		System.out.println("홀수의 개수 : " + oddCount(arr) + "개");
		System.out.println("합계 : " + sum(arr));
		System.out.printf("평균 : %.2f", avg(arr));
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static double avg(int[] arr) {
		return (double) sum(arr) / arr.length;
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int a : arr) {
			if (max < a)
				max = a;
			// max = Math.max(maxNum, a);
			// Math.max(a,b) => a,b 중 최대값을 리턴
		}
		return max;
	}

	public static int min(int[] arr) {
		int min = arr[0];
		for (int a : arr) {
//			if(min > a) min = a;
			min = Math.min(min, a);
		}
		return min;
	}

	public static int evenCount(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static int oddCount(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	public static void print(int[] arr) {

		System.out.print("array : ");

		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
