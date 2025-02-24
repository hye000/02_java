package com.kh.network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		// 사용자에게 입력받은 값을 UDP서버로 전송
		Scanner sc = new Scanner(System.in);

		System.out.print("전송 메시지 : ");
		String message = sc.nextLine();

		try (DatagramSocket ds = new DatagramSocket()) {
			// 서버 주소 (IP, Port)
			InetAddress ia = InetAddress.getByName("192.168.10.9");
			int port = 8888;

			// 데이터 통신을 위한 packet 객체 생성
			DatagramPacket dp = new DatagramPacket(message.getBytes(), // 전송데이터 (byte[])
					message.getBytes().length, // 전송데이터 길이
					ia, // 서버 네트워크 정보(IP
					port); // 포트 번호
			ds.send(dp);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
