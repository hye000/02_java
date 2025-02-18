package com.kh.io;

import java.io.File;
import java.io.IOException;

public class IO01_File {

	/*
	 * 파일을 통해 입출력하기 >> File 클래스 사용 (java.io.File)
	 */

	public static void main(String[] args) {
//		fileTest1();
		fileTest2();
	}

	public static void fileTest2() {
		// * sample 폴더를 생성한 후 myDiary.txt 파일을 만들어 보기
		File folder = new File("sample");
		// sample 폴더에 myDiary.txt 파일 객체 생성
		File f1 = new File("sample//myDiary.txt");

		// sample이라는 폴더가 존재하는 지 확인하고, 존재하지 않을 경우 폴더 생성
		if (!folder.exists()) {
			folder.mkdir();
		}

		try {
			if (!f1.exists()) {
				f1.createNewFile();
			}
			
			// * 파일 객체로부터 파일 정보 얻기
			System.out.println("파일명 : " + f1.getName());
			System.out.println("파일 경로 : " + f1.getAbsolutePath());
			System.out.println("파일 용량 : " + f1.length());
			System.out.println("파일의 상위 폴더 : " + f1.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fileTest1() {
		// File 객체 생성 => new File("파일명");
		// [1] 파일명만 전달하여 생성
		File f1 = new File("test1.txt");
		// => test1.txt라는 이름을 가진 파일 객체를 생성한 상태 (실제 파일은 생성되지 않음)
		// File객체명.createNewFile(); => 실제 파일을 만들어주는 메소드
		try {
			f1.createNewFile();
		} catch (IOException i) {
			i.printStackTrace();
		}

		// [2] 실제로 존재하는 폴더경로+파일명 전달하여 생성
		// >>D://test2.txt
		File f2 = new File("D:\\test2.txt");
		try {
			f2.createNewFile();
		} catch (IOException i) {
			i.printStackTrace();
		}

		// [3] 존재하지 않는 폴더 경로 + 파일명 전달하여 생성
		// >> D:\\tmp\\test3.txt

		File f3_folder = new File("D:\\tmp");
		// *폴더생성 : File객체명.mkdir()
		File f3 = new File("D:\\tmp\\test3.txt");
		// => 존재하지 않는 폴더에는 파일 생성 불가 (폴더 먼저 만들고 파일 생성해야함)

		try {
			f3_folder.mkdir();
			f3.createNewFile();
		} catch (IOException i) {
			i.printStackTrace();
		}

		// * 파일 존재 유무 확인
		File f4 = new File("test4.txt");

		// 파일이 존재하는 지 확인하는 메소드 : exists() : boolean
		System.out.println("f1 파일이 존재하는가? " + f1.exists());
		System.out.println("f4 파일이 존재하는가? " + f4.exists());

		// 파일인지 확인하는 메소드 : isFile() : boolean
		System.out.println("f1은 파일인가? " + f1.isFile());
		System.out.println("f3_folder는 파일인가?" + f3_folder.isFile());
	}
}
