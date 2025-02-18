package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	// 생성자를 통해 특정 경로에 폴더가 없을 경우 폴더 생성
	String path = "./resources/files";
	
	public FileDAO() {
		File folder = new File(path);
		if(!folder.exists()) {
			if(!folder.mkdirs()) {
				System.out.println("초기화 실패. 폴더 생성 실패");
			}
		}
	}
	
	public boolean checkName(String file) {
		File newFile = new File(path, file);
		// new File(상위폴더경로, 파일명); => 상위폴더경로/파일명
		return newFile.exists();
	}

	// 출력 작업
	public void fileSave(String file, String s) {
//		File newFile = new File(file);
		// String에 써서 저장

		File f = new File(path, s);
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path));){
			bw.write(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// 입력 작업
	public String fileOpen(String file) {
		String contents = "";	// 파일 전체 데이터를 저장하는 변수
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String data = null; //한줄한줄 읽어와서 저장하는 변수
			while((data = br.readLine()) != null) {
				contents += data;
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return contents;
	}
	
	// 매개변수로 받은 파일 명에 문자열 저장 (기존 내용에 이어서 저장, 출력)
	public void fileEdit(String file, String s) {
		File f = new File(path, file);
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))){
			bw.write(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
