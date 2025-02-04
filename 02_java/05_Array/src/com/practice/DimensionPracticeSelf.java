package com.practice;

import java.util.Scanner;

public class DimensionPracticeReview {

	public static void main(String[] args) {
//		practice02();
//		practice03();
//		practice04();
//		practice05();
//		practice06();
		practice07();
	}
	
	public static void practice07() {
		Scanner sc = new Scanner(System.in);
		
		int i;
		int j;
		
		char ch = 'a';
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		int col;
		
		char[][] chArr = new char[row][];	//열의 크기는 입력받을 것이기 때문에 비워둠
		
		for(i=0; i<chArr.length; i++) {
			System.out.printf("%d행의 열 크기 : ",i);
			col = sc.nextInt();
			
			chArr[i] = new char[col];
			
			for(j=0; j<chArr[i].length; j++) {
				chArr[i][j] = ch++;
			}
		}	
			for(i=0; i<chArr.length; i++) {
				for(j=0; j<chArr[i].length; j++) {
					System.out.print(chArr[i][j] + " ");					
				}
				System.out.println();			
			}
	}
	
	public static void practice06() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, 
			{"원", "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
			
			for(int i=0; i<strArr.length; i++) {
				for(int j=0; j<strArr[i].length; j++) {
					System.out.print(strArr[j][i] + " ");
				}
			}
	}
	public static void practice05() {
		Scanner sc = new Scanner(System.in);
		
		int row;
		int col;
		
		int i;
		int j;
		
		while(true) {
			System.out.print("행 크기 : ");
			row = sc.nextInt();
			System.out.print("열 크기 : ");
			col = sc.nextInt();
			
			if(row<1 || row>10 || col<1 || col>10) {	//row나 col의 값이 1~10 사이가 아니면 다시 입력
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			} else {
				char[][] chArr = new char[row][col];	//입력받은 행, 열 값 만큼의 2차원 배열 생성	
				for(i=0; i<chArr.length; i++) {
					for(j=0; j<chArr[i].length; j++) {
						chArr[i][j] = (char)((int)(Math.random()*26) + 65);
						//A-Z 는 65-90임
						//Math.random()*26은 0~25사이의 실수이고 여기서 65를 더하면 65~90사이의 값을 랜덤으로 받을 수 있음
						
						System.out.print(chArr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			}
		}
		
	}
	
	public static void practice04() {
		int[][] arr = new int[4][4];		//4행 4열 2차원 배열 생성
		int i;
		int j;
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				arr[i][j] = (int)(Math.random()*10+1);	//0행0열 ~ 2행2열까지 1~10 사이의 랜덤값 저장 
			}
		}
		
		// 마지막 행에 값을 더하여 저장
//		arr[3][0] = arr[0][0] + arr[1][0] + arr[2][0];
//		arr[3][1] = arr[0][1] + arr[1][1] + arr[2][1];
//		arr[3][2] = arr[0][2] + arr[1][2] + arr[2][2];
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				arr[3][i] += arr[j][i];
			}
		}
		
		// 마지막 열에 값을 더하여 저장
//		arr[0][3] = arr[0][0] + arr[0][1] + arr[0][2];
//		arr[1][3] = arr[1][0] + arr[1][1] + arr[1][2];
//		arr[2][3] = arr[2][0] + arr[2][1] + arr[2][2];
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				arr[i][3] += arr[i][j];
			}
		}
		
		// [3][3]에 모든 행, 열의 합을 저장
		arr[3][3] = arr[3][0] + arr[3][1] + arr[3][2] + arr[0][3] + arr[1][3] + arr[2][3];
		
		// 출력
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void practice03() {
		int[][] arr = new int[4][4];		//4행 4열짜리 정수형 배열 선언 및 할당
		
		int num = 16;
		int i;
		int j;
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				arr[i][j] = num--;
				
//				System.out.print(arr[i][j] + " ");	=> 이렇게 하면 정렬이 안 됨
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void practice02() {
		int[][] arr = new int[4][4];		//4행 4열짜리 정수형 배열 선언 및 할당
		
		int num = 1;
		int i;
		int j;
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				arr[i][j] = num++;
				
//				System.out.print(arr[i][j] + " ");	=> 이렇게 하면 정렬이 안 됨
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
