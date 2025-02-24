package com.kh.thread.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceiver implements Runnable {

	private Socket socket;

	public ServerReceiver(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// 소켓 객체로부터 스트림 객체를 생성
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

			// 새로운 메시지가 도착할 때마다 해당 내용을 출력
			while (true) {
				String message = br.readLine();
				System.out.println("클라이언트로부터 온 메시지 : " + message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
