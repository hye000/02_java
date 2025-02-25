package trip.controller;

import java.util.Scanner;
import trip.model.vo.*;

public class SignIn {
	
	// 필드
	public Reservation r = new Reservation();
	public CustomerInfo ci = new CustomerInfo();
	private Scanner sc = new Scanner(System.in);

	// 생성자
	public SignIn() {}

	// 메소드
	public void signInNew() {
		System.out.println();
		System.out.print("   이름을 입력하세요 : ");
		String name = sc.next();
		ci.setName(name);
		
		System.out.print("   아이디를 입력하세요 : ");
		String id = sc.next();
		ci.setId(id);

		System.out.print("   비밀번호를 입력하세요 : ");
		String pwd = sc.next();
		ci.setPwd(pwd);

		System.out.print("   이메일을 입력하세요 : ");
		String email = sc.next();
		ci.setEmail(email);

		System.out.print("   전화번호를 입력하세요 : ");
		String tel = sc.next();
		ci.setTel(tel);
		
		// 회원 객체 배열 만들기
//		CustomerInfo[] customers = new CustomerInfo[5];
		
		System.out.println("\n  " + ci.getName() + "님 회원가입을 환영합니다!");
		
		
	}
	
	public String signInfo() {
		String signInfo = String.format("  [회원 가입 정보] \n  이름 : %s | 아이디 : %s | 이메일 : %s | 전화번호 : %s \n",
				ci.getName(), ci.getId(), ci.getEmail(), ci.getTel());
		return signInfo;
	}
	
}
