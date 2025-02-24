package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	// 클라이언트용 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		// * 서버로 요청할 때 필요한 정보 -> 서버 IP, 포트번호
		String serverIP = "192.168.10.97";
//		String serverIP = "192.168.10.44";	//승재님
		int port = 3000;

		try {
			// 1) 서버로 연결 요청 => IP주소와 포트번호를 가지고 Socket 객체 생성
			socket = new Socket(serverIP, port);

			if (socket != null) {
				// 서버와 통신 성공
				System.out.println("==== 서버와 연결 됨 ===");

				// 2) 서버와의 입출력 스트림 생성
				// 3) 보조스트림을 사용하여 성능 개선

				// 입력용 스트림 ( 서버로부터 데이터를 전달받음 - 입력 )
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// 출력용 스트림 (서버로 데이터를 전달 - 출력)
				pw = new PrintWriter(socket.getOutputStream());

				while (true) {
					System.out.print("서버로 보낼 메시지 : ");
					String sendMessage = sc.nextLine();

					pw.println(sendMessage); // 입력받은 내용 전송
					pw.flush();

					String message = br.readLine();
					System.out.println("서버로부터 온 메시지 : " + message);
				}

			}
			// 만약 통신 실패 시 socket 객체에는 null값이 담김
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4) 통신 종료 (자원 반납)
			try {
				if (br != null)
					br.close();
				if (pw != null)
					pw.close();
				if (socket != null)
					socket.close();
			} catch (IOException e) { }
			sc.close();
		}
	}
}
