package com.kh.api;

public class API3_Wrapper {

	/*
	 * Wrapper 클래스
	 * : 기본 자료형을 객체화 해주는 클래스
	 * 
	 *	boolean	---> 	Boolean
	 *	char	---> 	Character
	 *	byte	---> 	Byte
	 *	short	---> 	Short
	 *	int		---> 	Integer
	 *	long	--->	Long
	 *	float	--->	Float
	 *	double	--->	Double
	 *
	 *	*기본 자료형을 객체로 표현해야 하는 이유?
	 *	- 다형성을 적용시키고 싶을 때
	 *	- 메소드 호출 시 매개변수가 기본자료형이 아닌 객체 타입만 요구될 때
	 */
	
	public static void main(String[] args) {
		// *Boxing : 기본 자료형 -> Wrapper 클래스 (객체화)
		int n1 = 100;
		int n2 = 200;
		
//		n1.equals(n2);
		
		// 1] 객체 생성 구문 사용
		Integer i1 = new Integer(n1);	// n1->i1
		Integer i2 = new Integer(n2);	// n2->i2
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// => 두 값을 비교하여 앞쪽의 값이 크면 1, 뒤쪽의 값이 크면 -1, 같으면 0을 반환

		
		// [2] 객체 생성 구문 없이 사용
		Integer i3 = n1;	// Auto Boxing
		System.out.println(i3);
		
		// 객체 생성을 통해 반드시 변환해야 하는 경우
		//	=> 문자열을 Integer 타입으로 변환하고 싶을 때
		Integer i4 = new Integer("300");
		Integer i5 = Integer.parseInt("400");
		
		// --------------------------------------------------------------------
		
		// UnBoxing : Wrapper 클래스 ---> 기본 자료형
		
		// [1] Wrapper 클래스에서 제공하는 메소드 사용(xxxValue())
		int n3 = i3.intValue();
		System.out.println(n3);
		
		int n4 = i4.intValue();
		System.out.println(n4);
		
		// [2] 메소드 사용하지 않고 바로 대입(Auto UnBoxing)
		int n5 = i5;
		
		// * String 과의 변환
		// String ---> 기본 자료형
		String str1 = "10";
		String str2 = "33.5";
		
		System.out.println(str1 + str2);
		int num = Integer.parseInt(str1);
		double dNum = Double.parseDouble(str2);
		System.out.println(num + dNum);
		
		// 기본자료형 ---> String
		System.out.println(num + " ");
		System.out.println(String.valueOf(num));
		// 전달된 값을 문자열로 바꿔주는 String 클래스의 메소드
		System.out.println(String.valueOf(dNum));
	}

}
