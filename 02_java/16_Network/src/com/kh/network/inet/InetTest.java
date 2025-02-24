package com.kh.network.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
	public void test() {
		// InetAddress : IP주소 관련 정보를 확인할 수 있는 클래스

		// * 내 PC에 대한 정보를 확인
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			
			System.out.println(localhost);
			// => PC정보/IP주소
			
			// 호스트 이름
			System.out.println("PC 정보 : " + localhost.getHostName());
			// 호스트의 IP 주소
			System.out.println("IP 정보 : " + localhost.getHostAddress());
			
			System.out.println("===========================================");
			
			// 도메인을 통해서 서버 정보를 확인
			InetAddress google = InetAddress.getByName("www.google.com");
			System.out.println("구글 서버명: " + google.getHostName());
			System.out.println("구글 IP 주소 : " + google.getHostAddress());
			
			System.out.println("===========================================");
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버의 호스트 개수 : " + naver.length);
			for(InetAddress n : naver) {
				System.out.println("네이버 호스트명 : " + n.getHostName());
				System.out.println("네이버 IP 주소 : " + n.getHostAddress());
			}
			
			InetAddress kh = InetAddress.getByName("www.kh-academy.co.kr");
			System.out.println(kh);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
