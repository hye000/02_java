package com.kh.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO00_IOStream {

	/*
	 * 
	 * 입출력 (IO, Input Output)
	 * : 프로그램 상의 데이터를 외부 매체로 출력하거나
	 *   반대로 외부 매체로부터 데이터를 입력받고자 할 때
	 *   프로그램과 외부 매체 사이에 데이터를 주고받는 연결통로로서
	 *   역할을 하는 것을 "스트림"이라 한다.
	 *   
	 * ----------           ---------           ----------
	 * | 외부 매체 | ======== |        | ======== |  외부매체  |
	 * |  키보드  | --데이터--> | 프로그램 | --데이터-->|  모니터   |
	 * |   파일   | ======== |        | ======== |  파일    |
	 * |  프로그램 |   입력     |        |   출력    |  프로그램  |
	 * ----------           ---------           ----------
	 * 
	 * * 스트림의 특징
	 *   - 단방향 : 입력용 스트림, 출력용 스트림이 나눠져 있음
	 *   		=> 입력과 출력을 동시에 하고자 한다면 ?
	 *   		   입/출력 스트림 각각 사용해야 함
	 *   - 선입선출(FIFO, First In First Out)
	 *     : 먼저 들어온 값이 먼저 나간다 (파이프를 생각할 것)
	 *   - 시간지연(delay)이 발생될 수 있음
	 *   
	 * * 스트림의 구분
	 *   > 사이즈 : 바이트(1byte) / 문자(2byte)
	 *     - 바이트 스트림 : 1byte씩 데이터가 왔다갔다 하는 통로
	 *       => 입력용 : InputStream
	 *       => 출력용 : OutputStream
	 *     - 문자 스트림 : 2byte씩 데이터가 왔다갔다 하는 통로
	 *       => 입력용 : Reader
	 *       => 출력용 : Writer
	 *       
	 *   > 외부 매체와 직접 연결유무
	 *     - 기반스트림: 외부 매체와 직접적으로 연결되는 통로. 필수로 사용해야 함
	 *     - 보조스트림: 기반스트림을 보조하는 통로
	 *     			   속도를 빠르게 하거나, 유용한 기능을 제공하기 위한 스트림
	 *     			   *단독으로 사용불가 반드시 기반스트림과 함께 사용해야 함
	 */
	
	public static void main(String[] args) {

		// I/O Stream을 사용하여 키보드로 입력받아 콘솔창에 출력하는 프로그램
		// 키보드 입력 -------> 프로그램 -------> 콘솔창 출력
		
		InputStream in = System.in;		// 표준 입력 스트림
		OutputStream out = System.out;	// 표준 출력 스트림
		
		byte[] buf = new byte[1024];
		// 입출력 시 버퍼의 데이터를 저장하기 위한 변수
		int len = 0;	// 데이터 길이를 저장하기 위한 변수
		
		try {
			while((len = in.read(buf)) != -1) {
				// 무한히 입력 받겠다 (=> 프로그램이 종료될 때까지 계속 입력 받음)
				
				// 콘솔창에 입력받은 값 출력 => 출력용 스트림
				out.write(buf, 0, len);
				// write(출력할값, 시작위치, 길이) => offset: 시작위치
				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 자원 반납(해제) => 프로그램에서 사용한 외부 장치 연결 해제
			try {
				if(in != null) in.close();
				if(out != null) out.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
