package com.kh.api;

public class API2_String {

	/*
	 * java.lang.String 클래스
	 */
	public static void main(String[] args) {
//		test1();
		test2();
	}

	public static void test1() {
		String str1 = "apple";
		String str2 = "apple";
		
		System.out.println("[1] " + (str1 == str2));	// true
		// str1 == str2 ---> 문자열 값을 비교하는 게 아니라, 주소값을 비교함
		// true가 나온 이유 => 문자열 값 자체를 대입하게 되면 "상수풀"이라는 공간에 값이 저장되어 같은 곳을 가리키게 됨(= 주소값이 같음)
		
		System.out.println("[2] " + (str1 == "apple"));	// true
		// str1이 가리키는 주소와 "apple"이라는 리터럴이 저장된 주소를 비교한 것
		// str1, "apple" 모두 상수풀 공간에서 같은 주소를 가리키고 있음
		
		String str3 = new String("apple");
		String str4 = new String("apple");
		System.out.println("[3] " + (str3 == str4));	// false
		// => 문자열 객체를 생성하여 값을 대입하게 되면 메모리에 새로운 영역에 할당
		//	  메모리에 새로운 영역에 할당하므로 각각 할당된 영역을 가리키게 됨(주소값이 다름)
		
		System.out.println("[4] " + (str3 == "apple"));	// false
		// => str3가 가리키는 주소와 "apple"이라는 값 자체가 저장된 주소(상수풀)를 비교함
		//	  str3는 새로운 메모리 공간에 할당 후 "apple"값을 저장
		//	  "apple" 값 자체는 상수풀에 저장되어 있기 때문에 서로 다른 곳을 가리키고 있음
		
		// * 문자열의 값을 비교하고자 할 때 equals 메소드를 사용
		System.out.println("문자열 값 비교 : " + str3.equals("apple"));
		System.out.println("----------------------------------------");
		
		String str5 = "Hello";
		String str6 = "World";
		
		System.out.println("[5] " + str5);	// Hello
		System.out.println("[6] " + str5.toString());	// World
		// => String 클래스에서는 toString 메소드가 재정의(오버라이딩)
		
		// *해쉬값(주소값)을 확인하는 메소드 : System.identityHashCode(참조변수명)
		int hash1 = System.identityHashCode(str5);
		System.out.println("[7] " + hash1);
		
		// str5 변수의 값을 변경
		// * 문자열.concat(추가할문자열) : String
		str5 = str5.concat(str6);
		System.out.println("[8] " + str5);
		
		int hash2 = System.identityHashCode(str5);
		System.out.println("[9] " + hash2);
	}

	public static void test2() {
		// 1) equals : 문자열A.equals(문자열B):boolean
		//				문자열A와 문자열B가 같은가?
		String str1 = "Hello";
		System.out.println("[1] " + str1.equals("Hello"));
		System.out.println("[2] " + str1.equals("Bye"));
		
		// 2) charAt => 문자열.charAt(인덱스):char
		//				해당 문자열의 인덱스 위치의 문자값을 반환
		System.out.println("[3] " + str1.charAt(1));
		
		// 3) length => 문자열.length():int
		//				해당 문자열의 길이를 반환
		System.out.println("[4] " + str1.length());
		System.out.println("[5] " + str1.charAt(str1.length()-1));
		
		// 4) toUpperCase => 문자열.toUpperCase():String
		//					 해당 문자열의 알파벳을 모두 대문자로 변환하여 반환
		//	  toLowerCase => 문자열.toLowerCase():String
		//					 해당 문자열의 알파벳을 모두 소문자로 변환하여 반환	
		System.out.println("[6] " + str1.toUpperCase());
		System.out.println("[7] " + str1.toLowerCase());
		
		// 5) contains => 문자열A.contains(문자열B):boolean
		//				  문자열A에 문자열B가 포함되는가?
		System.out.println("[8] " + str1.contains("el"));
		System.out.println("[9] " + str1.contains("tt"));
		
		// 6) indexOf => 문자열A.indexOf(문자열B):int
		//				 문자열A에 문자열B의 시작 인덱스를 반환
		System.out.println("[10] " + str1.indexOf("el"));
		System.out.println("[11] " + str1.indexOf("tt"));
		
		// 7) substring => 문자열.substring(시작인덱스):String
		//				    ㄴ문자열에서 시작인덱스부터 마지막위치까지 문자열을 추출하여 반환
		//					문자열.substring(시작인덱스, 끝인덱스):String
		//				    ㄴ문자열에서 시작인덱스부터 끝인덱스 직전까지 문자열을 추출하여 반환
		System.out.println("[12] " + str1.substring(2));
		System.out.println("[13] " + str1.substring(2, 4));
		
		// 8) repeat => 문자열.repeat(개수):String
		//				문자열을 개수만큼 반복하여 문자열을 반환
		System.out.println("[14] " + ("Happy".repeat(5)));
		System.out.println("=".repeat(30));
		
		// 9) split => 문자열.split("구분자"):String[]
		//				해당 문자열을 구분자를 기준으로 분리하여 문자열 배열형태로 반환
		String str2 = "HTML#CSS#JS#JAVA";
		String[] arr = str2.split("#");
		for(String a : arr) {
			System.out.println(a);
		}
	}
}
