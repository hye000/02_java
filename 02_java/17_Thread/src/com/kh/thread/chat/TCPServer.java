package com.kh.thread.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		// 1) 포트 지정 (IP는 PC에서 지정 됨)
		int port = 7777;

		// 2) ServerSocket 객체 생성(포트 번호 포함)
		try {
			ServerSocket server = new ServerSocket(port);
			
			// 3) Socket 객체 생성 (요청에 대한 수락)
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "에서 연결함 ...");
			
			// 클라이언트로부터 메시지를 받는 스레드 => ServerReceiver
			ServerReceiver sr = new ServerReceiver(socket);
			Thread t1 = new Thread(sr);
			
			// 클라이언트로 메시지를 보내는 스레드 => ServerSender
			ServerSender ss = new ServerSender(socket);
			Thread t2 = new Thread(ss);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
