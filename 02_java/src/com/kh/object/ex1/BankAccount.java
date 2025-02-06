package com.kh.object.ex1;

// 클래스명 : BankAccount
public class BankAccount {
	// [데이터 (변수)]
	int balance = 0;	// 예금잔액으로 사용 될 변수
	
	
	// [기능 (메소드)]
	/*
	 * 접근제한자 [예약어] 반환형 메소드명(매개변수정보) {코드}
	 */
	// 입금 기능(예금잔액에서 값을 더함)
	public void deposit(int money) {		//메소드1
		balance += money;
	}
	// 입금에도 잔액을 표시하고 싶다면 출금처럼 만들고 return 해주면 됨
	
	// 출금 기능(예금잔액에서 값을 뺌)
	public int withdraw(int money) {		//메소드2
		// 예금 잔액에서 전달된 금액을 뺌
		balance -= money;
		// 예금 잔액을 반환해 줌
		return balance;
	}
	
	// 조회 기능(예금 잔액 정보를 출력);
	public void check() {					//메소드3
		System.out.println("잔액 : " + balance);
	}
}
