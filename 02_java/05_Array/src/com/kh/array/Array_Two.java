package com.kh.array;

public class Array_Two {
	
	/*
	 * [2차원 배열]
	 * : "같은"자료형의 "1차원 배열의 묶음"으로, 배열 안에 배열이 존재한다
	 * : 2차원 배열은 할당된 공간마다 인덱스 번호를 두 개 부여한다 [행][열]
	 * 	[행] => 몇 번째 1차원 배열인지
	 * 	[열] => 1차원 배열에서 몇 번째 데이터인지
	 * 
	 * [표현식] => 1차원 배열의 묶음을 참조하는 2차원 배열의 참조변수를 만듦
	 * 	 -선언
	 * 		자료형[][] 변수명;
	 * 	 -할당
	 * 		변수명 = new자료형[행 크기][열 크기];
	 * 		* 행: 1차원 배열의 개수 / 열: 1차원 배열의 길이(생략 가능, 가변길이의 1차원 배열 할당 할 수 있음)
	 * 	 	
	 * 		1차원 배열의 참조변수 묶음을 먼저 생성
	 * 		변수명 = new 자료형[n][];
	 * 		변수명[0] = new 자료형[m];
	 * 		변수명[n-1] = new 자료형[x];
	 * 		=> 1차원 배열의 크기는 같은 수도 있고, 다를 수도 있음
	 * 
	 *   -선언 및 할당 동시에 진행
	 *   	자료형[][] 변수명 = new 자료형[행][열];
	 * 		
	 * 	 -값 대입
	 * 		변수명[배열순번][인덱스] = 값;
	 */ 
	
	public static void main(String[] args) {
//		practice1();
		practice2();
	}
	
	public static void practice1() {
		// 배열 선언
		// 정수형 2차원 배열 선언
		int[][] arr;
		
		// 배열 할당
		// 크기가 4인 1차원 배열 3개 묶음
//		arr = new int[3][4];	//방법1
		arr = new int[3][];		//방법2(반복문 사용)
		arr[0] = new int[4];
		arr[1] = new int[4];
		arr[2] = new int[4];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new int[4];
		}
		
		//첫번째 1차원 배열에 값을 대입
		arr[0][0] = 10;
		// arr[0]
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;
		
		for(int i=0; i<4; i++) {
			arr[0][i] = (i+1)*10;
		}
		
		for(int i=0; i<4; i++) {
			System.out.print(arr[0][i] + " ");
		}
		
	}

	public static void practice2() {
		/*
		 * (0행 0열) (0행 1열) (0행 2열)
		 * (1행 0열)	(1행 1열) (1행 2열)
		 * (2행 0열) (2행 1열) (2행 2열)
		 */
		
		// 2차원 배열 선언 및 할당
		String[][] str = new String[3][3];
		
		// 데이터 저장
/*		for(int i=0; i<str[0].length; i++) {
			str[0][i] = "(0행 " + i + "열)";
		}
		for(int i=0; i<str[1].length; i++) {
			str[1][i] = "(1행 " + i + "열)";
		}
		for(int i=0; i<str[2].length; i++) {
			str[2][i] = "(2행 " + i + "열)";
		}
*/
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				str[i][j] = "(" + i + "행 " + j + "열)";
			}
		}
		
		// 데이터 출력	
		for(int i=0; i<str.length; i++) {				// 바깥쪽 for문에서는 배열의 개수로 조건문 설정
			for(int j=0; j<str[i].length; j++) {		// 안쪽 for문에서는 배열의 길이로 조건문 설정
//				System.out.printf("(%d행 %d열) ", i, j);
				 System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
}
