package com.kh.array.pratice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// practice1();
		// practice2();
		// practice3();
		// practice4();
		// practice5();
		// practice6();
		// practice7();
		// practice8();
		// practice9();
		// practice10();
		// practice11();
		// practice12();
		// practice13();
		// practice14();
		// practice15();
		// practice16();
	}
	/*
		사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		
		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.	
	*/
	public static void practice16() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();		// 버퍼 비우기
		
		if (size > 0) {
			String[] arr = new String[size];
			int curr = 0;	// -- 배열 현재 위치를 저장할 변수 -- 
			
			while(true) {
				for(int i=curr; i<arr.length; i++) {
					System.out.printf("%d번째 문자열 : ", (i+1));
					arr[i] = sc.nextLine();
				}
				
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				char yn = sc.next().charAt(0);
				
				if(yn == 'y' || yn == 'Y') {
					System.out.print("더 입력하고 싶은 개수 : ");
					int add = sc.nextInt();
					sc.nextLine();		// 버퍼 비우기
					
					// ------- 배열 복사 -----------------------
					// 깊은 복사 -> 데이터 복사
					String[] newArr = new String[arr.length+add];
					System.arraycopy(arr, 0, newArr, 0, arr.length);
					curr = arr.length;
					
					// 얕은 복사 -> 새로 생성된 배열의 주소값 복사
					arr = newArr;
					// ----------------------------------------
				} else {
					if (yn != 'x' && yn != 'X') System.out.println("=== 잘못 입력하였습니다. 종료합니다. ===");
					break;
				}
			}
			
			// * 배열 데이터 출력 : Arrays.toString(배열명) -> [값1, 값2, 값3, ...] 형식으로 출력
			System.out.println(Arrays.toString(arr));
		}
	}
	
	/*
	 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	 * 문자의 개수와 함께 출력하세요.
	 */
	public static void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		// * 문자열 길이 : 문자열.length()
		// * 특정 위치의 문자 추출 : 문자열.charAt(인덱스)
		
		// 문자형 배열 선언 및 할당(문자열 길이만큼)
		int strLen = str.length();
		char[] chArr = new char[strLen];
		int idx = 0;	// 배열에서 사용할 인덱스
		for(int i=0; i<strLen; i++) {			
			// * 중복된 문자가 있는 지 체크
			boolean isDup = false;
			
			for(int j=0; j<i; j++) {
				// 문자열의 i번째 위치의 문자와, 배열의 j번째 위치의 문자 비교!
				if (str.charAt(i) == chArr[j]) {
					isDup = true;
					break;
				}
			}
			
			// if (isDup == false) {
			if (!isDup) {
				chArr[idx++] = str.charAt(i);
				// idx++; // => 후위연산 특징에 따라 한줄로 작성 가능!
			}
		}
		
		// 출력
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<idx; i++) {
			System.out.print(chArr[i]);
			
			if (i < idx-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		
		System.out.println("문자 개수 : " + idx);
	}
	
	/*
	 * 로또 번호 자동 생성기 프로그램을 작성하는데 
	 * 중복 값 없이 오름차순으로 정렬하여 출력하세요.
	 */
	public static void practice14() {
		// * 로또 번호 : 1 ~ 45 숫자 6개
		int[] lotto;		// lotto => "참조변수": 값 자체를 저장하는 것이 아니라 
							// 					  실제 데이터가 저장된 위치(주소값)을 가지고 있음
		lotto = new int[6];
		
		// 랜덤값으로 대입
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			// 중복 제거 => 현재 위치(i) 기준으로 이전 위치까지의 데이터와 비교
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					// 중복되는 값이 있는 경우
					i--;
					break;
				}
			}
		}
		
		// * 배열을 오름차순으로 정렬 : Arrays.sort(배열명);
		//   => import java.util.Arrays; 필요!
		Arrays.sort(lotto);
		
		// 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	/*
		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.	
	*/
	public static void practice13() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
	
	
	/*
		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		1~10 사이의 난수를 발생시켜 배열에 초기화 후
		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
	*/
	public static void practice12() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int data : arr) {
			System.out.print(data + " ");
		}
		// ------ 11번 문제와 동일 -----------------
		System.out.println();
		
		/* 직접 찾아보는 방법 */
		/*
		int max = arr[0]; int min = arr[0];	// 첫번째 값을 대입한 후 비교
		for(int i=1; i<arr.length; i++) {	// 두번째 데이터부터 비교 
			max = max < arr[i] ? arr[i] : max;
			min = min > arr[i] ? arr[i] : min;
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		*/
		
		/* 오름 차순 정렬 후 최대, 최소값 구하는 방법 */
		Arrays.sort(arr);	// 오름차순 정렬
		
		System.out.println("최대값 : " + arr[arr.length-1]);	// 마지막 인덱스 값: arr.length - 1
		System.out.println("최소값 : " + arr[0]);			// 첫번째 인덱스 값
	}
	
	
	/*
		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요	
	*/
	public static void practice11() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int data : arr) {
			System.out.print(data + " ");
		}
	}
	
	/*
		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
	*/
	public static void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호 (-포함) : ");
		String ssn = sc.next();
		
		// ------ 입력된 문자열을 문자 배열에 저장 --
		char[] origin = new char[ssn.length()];
		for(int i=0; i <ssn.length(); i++) {
			origin[i] = ssn.charAt(i);
		}
		// --------------------------------------
		
		// ------ 원본 배열 복사 ------------------
		char[] copy = new char[origin.length];
		copy = origin.clone();
		// --------------------------------------
		
		// ------ 복사본 배열의 값 변경 ------------
		for(int i=8; i<copy.length; i++) {
			copy[i] = '*';
		}
		// --------------------------------------
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]);
		}
		
		
	}
	
	
	/*
		사용자가 입력한 값이 배열에 있는지 검색하여
		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
	*/
	public static void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] chickens = {"양념", "후라이드", "파닭", "순살"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String order = sc.next();
		
		boolean isExist = false;
		/*
		for(int i=0; i<chickens.length; i++) {
			if (chickens[i].equals(order)) {
				isExist = true;
				break;
			}
		}
		*/
		// for-each 문 사용
		/*
			for( 자료형 변수명 : 배열명 ) {
				// 변수명을 통해 배열의 첫번째 위치부터 마지막 위치까지 탐색 가능!
			}
		*/
		for(String chicken : chickens) {
			if (chicken.equals(order)) {
				isExist = true;
				break;
			}
		}
		
		if(isExist) {
			System.out.printf("%s 치킨 배달 가능", order);
		} else {
			System.out.printf("%s 치킨은 없는 메뉴입니다", order);
		}		
	}
	
	
	/*
		3이상인 홀수 자연수를 입력 받아 
		배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 
		“다시 입력하세요”를 출력하고 다시 정수를 받도록 하세요.
	 */
	public static void practice8() {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			
			if (num % 2 != 0 && num >= 3) {
				// 입력받은 값이 홀수이고 3이상인 경우 반복문 종료!
				break;
			}
			
			System.out.println("다시 입력하세요");			
			// * 입력받은 값이 홀수가 아니거나 3미만인 경우 "다시 입력하세요" 출력
//			if (num % 2 == 0 || num < 3) {
//				System.out.println("다시 입력하세요");
//			}
		}
		
		// 입력받은 값만큼의 배열 선언 및 할당
		// 5입력 시 => 1, 2, 3, 2, 1       => 중간 위치 : 5/2 => 2
		// 7입력 시 => 1, 2, 3, 4, 3, 2, 1 => 7/2 => 3
		int[] arr = new int[num];
		int mid = num / 2; // arr.length / 2;
		for(int i=0; i<arr.length; i++) {
			// 5입력 시...
			// i=0) arr[0] = 1 --> i+1
			// i=1) arr[1] = 2 --> i+1
			// i=2) arr[2] = 3 --> i+1
			// i=3) arr[3] = 2 --> num-i => 5-3 => 2
			// i=4) arr[4] = 1 --> num-i => 5-4 => 1
			// arr[i] = i <= mid ? i+1 : num - i;
			if (i <= mid) {
				arr[i] = i+1;
			} else {
				arr[i] = num - i;
			}
		}
		
		// * 배열에 저장된 데이터 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			
			if (i < arr.length-1) {
				System.out.print(", ");
			}
		}
		
	}
	/*
		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.	
	*/
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int n = sc.nextInt();
		
		if (n > 0) {
			int[] arr = new int[n];
			for(int i=0; i<arr.length; i++) {
				System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
				arr[i] = sc.nextInt();
			}
			System.out.println();
			
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
				sum += arr[i];
			}
			System.out.println();
			
			System.out.println("총 합 : " + sum);
		}
	}
	
	/*
		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 
		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
	*/
	public static void practice6() {
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int n = sc.nextInt();
		
		if (n >= 0 && n < days.length) {
			System.out.println(days[n] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	/*
		문자열을 입력 받아 문자 하나하나를 배열에 넣고 
		검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 
		몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.	
	 */
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		// 입력받은 문자열을 배열에 저장
		// * 배열 선언 및 할당(문자열 길이만큼!)
		// char[] chArr = new char[str.length()];
		int len = str.length();
		char[] chArr = new char[len];
		
		// * 문자열에서 한 문자씩 배열에 저장
		for(int i=0; i<chArr.length; i++) {
			chArr[i] = str.charAt(i);
		}
		
		// * 입력받은 문자에 해당하는 값을 확인하여 인덱스, 개수 출력
		int count = 0;
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
		for(int i=0; i<chArr.length; i++) {
			if (chArr[i] == ch) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.printf("%c 개수 : %d", ch, count);
		
	}
	
	/*
		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		배열 인덱스를 활용해서 귤을 출력하세요.
	*/
	public static void practice4() {
		String[] fruits = new String[5];
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";
		// => 동시에 하면 .. String[] fruits = new String[] {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(fruits[1]);
	}
	
	/*
		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
	*/	
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			int[] arr = new int[num];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = i+1;
			}
			
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} else {
			System.out.println("양의 정수를 입력해주세요.");
		}
	}
	
	
	/*
		길이가 10인 배열을 선언하고 
		1부터 10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후
		그 값을 출력하세요.
	 */
	public static void practice2() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			// i=0) arr[0] = 10; // 10 - 0 => 10
			// i=1) arr[1] = 9;  // 10 - 1 => 9
			// i=2) arr[2] = 8;  // 10 - 2 => 8
			// ...
			// i=9) arr[9] = 1;
			arr[i] = arr.length - i;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	/*
		길이가 10인 배열을 선언하고 
		1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 
		그 값을 출력하세요.
	 */
	public static void practice1() {
		// * 배열 선언 및 할당
		int[] arr = new int[10];	// 인덱스: 0 ~ 9
		
		// * 값 대입
		for(int i=0; i<arr.length; i++) {
			// i=0) arr[0] = 1
			// i=1) arr[1] = 2
			// ...
			// i=9) arr[9] = 10
			arr[i] = i+1;
		}
		
		// * 값 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}



