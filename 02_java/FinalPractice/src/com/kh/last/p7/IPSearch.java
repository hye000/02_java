package com.kh.last.p7;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("호스트명 : ");
		String host = sc.nextLine();
		
		try {
			InetAddress[] ia = InetAddress.getAllByName(host);
			System.out.println(host + "는 " + ia.length + "개의 IP주소를 가지고 있습니다.");
			
			for(int i=0; i<ia.length; i++) {
				System.out.println((i+1) + "번 IP = " + ia[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
