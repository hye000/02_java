package com.practice;

import java.util.Scanner;

public class DimensionPractice {

	public static void main(String[] args) {
//		practice1();
//		practice2();
//		practice3();
//		practice4();
//		practice5();
//		practice6();
//		practice7();
		practice8_9();
//		practice4_1();
//		practice7_1();
	}

	public static void practice1() {
		// 3행 3열짜리 문자열 배열을 선언 및 할당하고
		// 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요

		String[][] str = new String[3][3];

		// 저장
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				str[i][j] = "(" + i + ", " + j + ")";
			}
		}

		// 출력
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void practice2() {
		// 4행 4열짜리 정수형 배열 선언 및 할당

		int[][] arr = new int[4][4];

//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[0][3] = 4;
//		
//		arr[1][0] = 5;
//		arr[1][1] = 6;
//		arr[1][2] = 7;
//		arr[1][3] = 8;

		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();

			/*
			 * [강사님 풀이] // 4행 4열짜리 정수형 배열을 선언 및 할당 int[][] arr = new int[4][4];
			 * 
			 * int value = 1; // 1~16까지 값을 차례대로 저장 for(int i=0; i<arr.length; i++) { for(int
			 * j=0; j<arr[i].length; j++){ arr[i][j] = value++; } } //출력 for(int i=0;
			 * i<arr.length; i++) { for(int j=0; j<arr[i].length; j++){
			 * System.out.printf("%2d ",arr[i][j]); } System.out.println(); }
			 * 
			 * // [*다른 풀이] for(int i=0; i<arr.length; i++) { for(int j=0; j<arr[i].length;
			 * j++){ arr[i][j] = (j+1)+(4*i); } System.out.println(); }
			 */
		}
	}

	public static void practice3() {
		int[][] arr = new int[4][4];

		int num = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num--;
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void practice4() {

		/*
		 * [강사님 풀이] int[][] arr = new int[4][4];
		 * 
		 * // 0행 0열 ~ 2행 2열까지 랜덤값 for(int i=0; i<3; i++){ for(int j=0; j<3; j++){
		 * arr[i][j] = (int)(Math.random() * 10 + 1); } }
		 * 
		 * // 마지막 행과 마지막 열에 값을 더하여 저장 arr[3][0] = arr[0][0] + arr[1][0] + arr[2][0];
		 * arr[3][1] = arr[0][1] + arr[1][1] + arr[2][1]; arr[3][2] = arr[0][2] +
		 * arr[1][2] + arr[2][2];
		 * 
		 * for(int i=0; i<3; i++){ for(int j=0; j<3; j++){ arr[3][i] += arr[j][i]; } }
		 * 
		 * for(int i=0; i<3; i++){ for(int j=0; j<3; j++){ arr[i][3] += arr[i][j]; } }
		 * 
		 * arr[3][3] = arr[3][0] + arr[3][1] + arr[3][2] + arr[0][3] + arr [1][3] +
		 * arr[2][3];
		 * 
		 * //출력 for(int i=0; i<arr.length; i++) { for(int j=0; j<arr[i].length; j++) {
		 * System.out.printf("%3d",arr[i][j] + " "); } System.out.println(); }
		 */

		int[][] arr = new int[4][4];

		// 저장
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=0; j<arr[i].length-1; j++) {
//				arr[i][j] = (int)(Math.random() * 10 + 1);
//			}
//		}
		int sum = 0;
//		arr[0][3] 
//		arr[1][3] 
//		arr[2][3] = 행 합

//		arr[3][0]
//		arr[3][1]
//		arr[3][2] = 열 합

//		arr[3][3] 총합

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i < arr.length - 1 && j < arr[i].length) {
					arr[i][j] = (int) (Math.random() * 10 + 1);
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void practice4_1() {
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				// 마지막 행의 인덱스
				int lastRow = arr.length - 1;
				// 마지막 열의 인덱스
				int lastCol = arr[i].length - 1;

				if (i < lastRow && j < lastCol) {
					// 0,0 ~ 2,2 위치에 랜덤값을 저장
					arr[i][j] = (int) (Math.random() * 10 + 1);
				}
				// 행의 위치가 마지막 행이 아닌 경우 현재 값을 더해서 마지막 행에 저장
				if (i < lastRow) {
					arr[lastRow][j] += arr[i][j];
				}
				// 마지막 열의 위치에 현재값 저장
				if (j < lastCol) {
					arr[i][lastCol] += arr[i][j];

				}
			}
		}

	}

	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 크기 : ");
		int row = sc.nextInt();

		System.out.print("열 크기 : ");
		int col = sc.nextInt();

		char[][] caps = new char[row][col];

		if (row < 1 || row > 10 || col < 1 || col > 10) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		} else {
			for (int i = 0; i < caps.length; i++) {
				for (int j = 0; j < caps[i].length; j++) {
					caps[i][j] = (char) ((int) (Math.random() * 26) + 65);
				}
			}
		}

		// 출력
		for (int i = 0; i < caps.length; i++) {
			for (int j = 0; j < caps[i].length; j++) {
				System.out.print(caps[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
		}
	}
	
	public static void practice7_1() {
		// 강사님 풀이
		Scanner sc= new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		if(row>0) {
			char[][] arr = new char[row][];	//입력 받은 행의 크기만큼 가변 배열 선언 및 할당
			
			for(int i=0; i<arr.length; i++) {
				System.out.printf("%d행의 열 크기 : ", i);
				int col = sc.nextInt();
				
				arr[i] = new char[col];		//입력 받은 열 크기로 1차원 배열 할당	
			}
			
			char ch = 'a';
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = ch++;
					
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}	
		}
		
	}

	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		
		char ch = 'a';
		
		System.out.print("행의 크기 : ");
		row = sc.nextInt();

		char[][] arr = new char[row][];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d행의 열 크기 : ", i);
			col = sc.nextInt();
			
			arr[i] = new char[col];
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ch++;
			}

		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void practice8_9() {
		// =========================== practice8 ===============================
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] std1 = new String[3][2];
		String[][] std2 = new String[3][2];
		
		int row = 0;
		int col = 0;
		
		System.out.println("== 1분단 ==");
		for(int i=0; i<students.length; i++) {
			if(i<students.length/2) {
				std1[row][col] = students[i];
				System.out.print(std1[row][col] + " ");
				col++;
				
				if(col == std1[row].length) {
					row++;
					col = 0;
					System.out.println();
				}
			} else {
				std2[row][col] = students[i];
				
				System.out.print(std2[row][col] + " ");
				col++;
				
				if(col == std2[row].length) {
					row++;
					col = 0;
					System.out.println();
				}
			}
			if(i == students.length/2-1) {
				row=0;
				col=0;
				System.out.println("== 2분단 ==");
			}
		}
		
		// =========================== practice9 ===============================
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(int i=0; i<std1.length; i++) {
			for(int j=0; j<std1[i].length; j++) {
				if(std1[i][j].equals(name)) {
					if(j == 0) {
						System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 왼쪽에 있습니다",name,i+1);
					} else {
						System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 오른쪽에 있습니다",name,i+1);
					}
				}
			}
		}
		for(int i=0; i<std2.length; i++) {
			for(int j=0; j<std2[i].length; j++) {
				if(std2[i][j].equals(name)) {
					if(j == 0) {
						System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 왼쪽에 있습니다",name,i+1);
					} else {
						System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 오른쪽에 있습니다",name,i+1);
					}
				}
			}
		}
		
	}

}
