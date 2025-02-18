package com.kh.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IO02_AssistantStream {

	/*
	 * 보조 스트림 : 기반 스트림만으로 부족한 성능을 향상 시켜주는 스트림(보조해줌)
	 * 기반 스트림에서 제공하지 않는 추가적인 메소드를 가짐 => 데이터 전송 속도가 향상됨
	 * 외부 매체와 직접적으로 연결되지 않기 때문에 단독 사용 불가함 => 반드시 기반 스트림과 함께 사용
	 */

	public static void main(String[] args) {
//		fileSave();
//		fileRead();
//		objectSave();
		objectRead();
	}

	// 프로그램 ---> 파일 : 출력
		public static void fileSave() {
			// FileWriter : 기반스트림, 파일을 직접적으로 연결하여 2바이트씩 출력하는 스트림
			// BufferedWriter : 속도 향상을 도와주는 보조스트림
	
			System.out.println(" ===== fileSave START =====");
	
			// try with resources 구문 : 자원을 알아서 해제(반납)해주는 문법
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("as_text.txt"))) {
				/*
				 * try { // 1. 기반스트림 생성 FileWriter fw = new FileWriter("as_test.txt");
				 * 
				 * // 2. 보조스트림 생성 => 기반스트림 객체를 전달 BufferedWriter bw = new BufferedWriter(fw);
				 */
				bw.write("기반스트림 사용\n");
				bw.write("반가워요\n");
				bw.newLine();
				bw.write("작성 끝");
	
				bw.flush();
	//			bw.close();  보통 finally구문에서
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	// 파일 ---> 프로그램 : 입력
		public static void fileRead() {
			// FileReader : 기반스트림, 파일에 직접 연결하여 2바이트씩 데이터를 입력받을 수 있는 스트림
			// BufferedReader : 한 줄씩 데이터를 읽어오도록 도와주는 보조스트림
			System.out.println(" ===== fileSave START =====");
		
			// try(BufferedReader br = new BufferedReader(new FileReader("as_text.txt"));
			try {
				FileReader fr = new FileReader("as_test.txt");
				BufferedReader br = new BufferedReader(fr);
				// 파일 읽어오기
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				System.out.println(br.readLine());
		
				System.out.println(br.readLine());
				// => 읽어올 내용이 없을 땐 null 값으로 확인됨
		
				String data = null;
				while ((data = br.readLine()) != null) {
					System.out.println(data);
				}
			} catch (FileNotFoundException e) {
				System.out.println("파일이 없습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	// 프로그램 ---> 파일 : 출력, 객체에 저장된 데이터
		public static void objectSave() {
			// 출력할 데이터
			Product p1 = new Product("텀블러", 10000);
			Product p2 = new Product("모니터", 500000);
			Product p3 = new Product("노트", 3000);
		
			// FileOutputStream : 기반스트림, 1바이트 단위로 파일에 출력하는 스트림
			// ObjectOutputStream : 보조스트림, 객체 단위로 출력을 도와주는 스트림
		
			try (ObjectOutputStream oos = 
					new ObjectOutputStream(new FileOutputStream("myProduct.txt"));) 
			{
				oos.writeObject(p1);
				oos.writeObject(p2);
				oos.writeObject(p3);
		
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	// 파일 ---> 프로그램 : 입력, 객체로 저장한 데이터
	public static void objectRead() {
		// FileInputStream : 기반스트림
		// ObjectInputStream : 보조스트림
		
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("myProduct.txt"))) {
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
//			
//			System.out.println(ois.readObject());
			// 없는 데이터는 읽지 않고 EOFException 발생
			while(true) {
				System.out.println(ois.readObject());
			}
		}catch(EOFException e) {	// IO 위에 작성해야 함 unreachable 때문
			// => End Of File, 파일의 끝에 도달해 더 이상 읽을 것이 없다
			System.out.println("파일 데이터 모두 입력 완료!");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
