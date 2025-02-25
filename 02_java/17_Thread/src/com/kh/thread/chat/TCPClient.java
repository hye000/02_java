package com.kh.thread.chat;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		// 1) 서버의 IP 주소, 포트 번호 확인 => localhost, 7979
		// 2) Socket 객체 생성(=> 서버 정보를 전달)
		try {
			Socket socket = new Socket("192.168.10.9", 7979);
			// 규형님 IP : 192.168.10.104
			
			if(socket != null) {
				// 객체가 생성이 잘 되었는지 확인
				// 3) 스트림 생성 후 데이터 통신
				
				// * Thread 클래스 상속 받는 방법
				// ** 서버로부터 메시지를 받는 스레드 => ClientReceiver
				ClientReceiver cr = new ClientReceiver(socket);
				// ClientReceiver 클래스가 이미 Thread 클래스를 상속하고 있기 때문에 따로 생성해 줄 필요 없이 바로 실행 가능함
				cr.start();
				
				// 서버로 메시지를 보내는 스레드 => ClientSender
				ClientSender cs = new ClientSender(socket);
				cs.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
