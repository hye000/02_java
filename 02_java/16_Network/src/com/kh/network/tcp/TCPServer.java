package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	/*
	 * 	TCP 
	 * 	- 서버, 클라이언트 간에 1:1 소켓 통신
	 * 	- 데이터 교환 전 서버와 클라이언트의 연결이 되어야 함
	 * 		(서버가 먼저 실행되어 클라이언트의 요청을 기다려야 함)
	 * 	- 신뢰성 있는 데이터 전달 가능
	 * 
	 * 	Socket
	 * 	- 프로세스 간의 통신을 담당
	 * 	- 스트림(input/outputStream)을 가지고 있음
	 * 		(해당 스트림을 이용하여 입출력이 가능)
	 * 
	 * 	ServerSocket
	 * 	: 포트와 연결 되어 외부의 연결 요청을 기다림 => 요청이 들어오면 수락함
	 * 		*수락한다는 것은, 통신할 수 있는 Socket을 생성한다는 의미
	 */

	// 서버용 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		// 1) 포트번호 지정
		int port = 3000;

		// 2) ServerSocket 객체 생성 (지정한 포트번호를 사용)
		try {
			server = new ServerSocket(port);
			System.out.println("=== 클라이언트 요청 대기 중 ===");

			// 3) 요청이 들어오면 수락 후 소켓 객체 생성
			// -> 소켓 : 클라이언트와 통신을 담당하는 객체
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + " 가 연결됨");

			// 입출력 스트림 생성
			// 4) 클라이언트와 입출력 기반 스트림 생성(바이트 스트림만 가능)
			// 5) 보조스트림 활용하여 성능 개선

			// 입력용 스트림 (클라이언트로부터 전달된 값을 한줄 단위로 읽어오기 위해 사용)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// BufferedReader : readLine 메소드 사용

			// 출력용 스트림(클라이언트로 값을 전달)
			pw = new PrintWriter(socket.getOutputStream());
			// PrintWriter : print, println 메소드 사용 가능

			while (true) {
				String message = br.readLine();
				System.out.println("클라이언트로부터 온 메시지 : " + message);

				System.out.print("클라이언트에게 보낼 메시지 : ");
				String sendMessage = sc.nextLine();

				pw.println(sendMessage); // 클라이언트에게 데이터 전달(출력)
				pw.flush(); // 해당 스트림에 있는 데이터를 강제로 내보내기
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 6 통신 종료(자원 반납)
				if (pw != null)
					pw.close();
				if (br != null)
					br.close();
				if (server != null)
					server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			sc.close();
		}
	}

}
