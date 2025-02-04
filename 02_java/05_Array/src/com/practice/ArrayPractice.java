package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
//		practice1();
//		practice2();
//		practice3();
//		practice4();
//		practice5();
//		practice6();
//		practice7();
//		practice8();
//		practice9();
//		practice10();
//		practice11();
//		practice12();
//		practice13();	
//		practice14();	*
		practice15();	
//		practice16();
		

	}

	public static void practice1() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void practice2() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int[] arr = new int[10];
		for(int i=9; i>0; i--) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		/* for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length - i;
		}*/
	}
	
	public static void practice3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void practice4() {
		// 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		// 배열 인덱스를 활용해서 귤을 출력하세요
		
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(arr[1]);
	}
	
	public static void practice5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		char[] chArr = new char[str.length()];
		
		for(int i=0; i<chArr.length; i++) {
			chArr[i] = str.charAt(i);
//확인용		System.out.println(chArr[i]);
		}
		
		// *** 입력 받은 문자에 해당하는 값을 확인하여 인덱스, 개수 출력 ***
		int count = 0;
		System.out.printf("%s에 %c(이)가 존재하는 위치(인덱스) : ",str,ch);
		
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i] == ch) {
				count ++;
				System.out.print(i + " ");
			}
		}
		
		System.out.printf("\n%c 개수 : %d",ch,count);		
	}
	
	public static void practice6() {
		// “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		// 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		char[] chArr = {'월', '화', '수', '목', '금', '토', '일'};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int day = sc.nextInt();
		
		if(0 <= day && day <=6) {
			System.out.println(chArr[day]);
		} else{
			System.out.println("잘못 입력하셨습니다.");
			}
		
	}

	public static void practice7() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			int arrNum = sc.nextInt();
			arr[i] = arrNum;			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
		
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		
		System.out.printf("\n총 합 : %d", total);
	}
	
	public static void practice8() {
		// 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		// 다시 정수를 받도록 하세요.
		Scanner sc = new Scanner(System.in);
		
		int num;
		while(true) {
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		if(num % 2 != 0 && num >= 3) {
			break;
		}
		System.out.println("다시 입력하세요.");

		}
		
		int[] arr = new int[num];
		
		// -------------------------------------
		int mid = num/2;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i <= mid ? i+1 : num-i;
			}
			/*
			 * if( i <= mid) {
			 * 	arr[i] = i+1;
			 * } else {
			 *	arr[i] = num - i;
			 * }
			 */
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length-1) {
				System.out.print(", ");
			}
		}
	}
	
	public static void practice9() {
		// 사용자가 입력한 값이 배열에 있는지 검색하여
		// 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		// 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = {"후라이드", "양념", "간장"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.next();
		
		for(int i=0; i<chicken.length; i++) {
			if(chicken[i].equals(menu)) {
				System.out.printf("%s치킨 배달 가능",menu);
			}
		}
	}
	
	public static void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호 (-포함) : ");
		String id = sc.next();
		
		char[] chArr = new char[id.length()];	// 배열 복사
		
		for(int i=0; i<chArr.length; i++) {
			chArr[i] = id.charAt(i);
//확인용		System.out.println(chArr[i]);
		}
		
		for(int i=8; i<chArr.length; i++) {		// 8번 index부터 값 변경
			chArr[i] = '*';
		}
		System.out.println(chArr);
//확인용	System.out.println(id);					
		
		
	}

	public static void practice11() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void practice12() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			System.out.print(arr[i] + " ");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.printf("\n최댓값 : %d",max);
		System.out.printf("\n최소값 : %d",min);
	}
	
	public static void practice13() {
		// 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.

		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			for(int j = 0; j < i; j++) {
	            if(arr[i] == arr[j]) {
	                i--;
	            }
	        }
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
	}
	
	public static void practice14() {
		// 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
		
		// 강사님 풀이
		
		int[] lotto;		// 참조변수 : 값 자체를 저장하는 것이 아니라 실제 데이터가 저장된 위치(주소값)을 가지고 있음
		lotto = new int[6];
		
		// 랜덤값으로 대입
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			// 중복 제거하려면 => 현재 위치[i] 기준으로 이전 위치까지의 데이터와 비교
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					//중복되는 값이 있는 경우, i는 현재 위치 j는 이전 위치
					i--;
					break;
				}
			}
		}
		
		// *배열을 오름차순으로 정렬 메소드 : Arrays.sort(배열명);
		// => import.java.util.Arrays;
		Arrays.sort(lotto);

		//출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		
/*		int[] arr = new int[6];
		int sort = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45 + 1);
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					sort = arr[i];
					arr[i] = arr[j];
					arr[j] = sort;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
		*/
		
	}
	
	public static void practice15() {
		// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		// 문자의 개수와 함께 출력하세요.
		
		// 강사님 풀이
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] chArr = new char[str.length()];
		int idx = 0;	// 배열에서 사용할 인덱스
		
		for(int i=0; i<str.length(); i++) {
			chArr[i] = str.charAt(i);
			boolean isDup = false;
			//중복된 문자 제거
			for(int j=0; j<i; j++) {
				// 문자열의 i번째 위치의 문자와, 배열의 j번째 위치의 문자 비교
				if(str.charAt(i) == chArr[j]) {
					isDup = true;
					break;
				}
			}
			if(!isDup) {	// if(isDup == false)
				chArr[idx++] = str.charAt(i);
			}
		}
		
		//출력
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<idx; i++) {
			System.out.print(chArr[i]);
			if(i<idx-1) {
				System.out.print(", ");
			}
		}
		System.out.println("\n문자 개수 : " + idx);
/*		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] chArr = new char[str.length()];
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<chArr.length; i++) {
			chArr[i] = str.charAt(i);
			System.out.print(chArr[i]);
			if(i<chArr.length-1) {
				System.out.print(", ");
			}
		}
		
		int count=0;
		for(int i=0; i<chArr.length; i++) {
			for(int j=0; j<i; j++) {
				if(chArr[i] == chArr[j]) {
					count += 1;
				}
			}
		}
		System.out.printf("\n문자 개수 : %d", count);
		
		*/
//		for(int i=0; i<chArr.length; i++) {
//			for(int j=0; j<i; j++) {
//				if(chArr[i] == chArr[j]) {
//					i-- ;
//					break;
//				}
//			}
//		}
	}
	
	public static void practice16() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String[] strArr = new String[num];
		
		for(int i=0; i<strArr.length; i++) {
			System.out.printf("%d번째 문자열 : ", i+1);
			strArr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char answer = sc.next().charAt(0);
			
			if(answer == 'y' || answer == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int num2 = sc.nextInt();
				sc.nextLine();
				
				String[] strArr2 = new String[strArr.length+num2];		//배열복사
				System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
				
				for(int i=strArr.length; i<strArr2.length; i++) {
					System.out.printf("%d번째 문자열 : ", i+1);	//수정
					strArr2[i] = sc.nextLine();
				}
			} else if(answer == 'n' || answer == 'N') {
				System.out.print("[");
				for(int i=0; i<strArr.length; i++) {
					System.out.print(strArr[i]);
					if(i<strArr.length-1) {
						System.out.print(", ");
					}
				}
				System.out.print("]");
			}	break; //?
		}	
		
		 
	}
}
