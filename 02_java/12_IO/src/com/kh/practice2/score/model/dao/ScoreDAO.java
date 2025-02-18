package com.kh.practice2.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {
	
	// 메소드에서 공통적으로 사용하기 위해 필드 추가 **
	private String path = "./resources/files/";
	private String fileName = "score.txt";
	
	public ScoreDAO() {
		// 파일 경로 체크
		File folder = new File(path);
		if (!folder.exists()) {
			if (!folder.mkdirs()) System.out.println("[ERROR] 폴더 초기화 실패!! ::" + path);
		}
		
		// 기존에 저장된 파일이 있다면.. 제거
		File file = new File(path, fileName);
		if (file.exists()) {
			file.delete();
		}
	}
	
	/**
	 * 매개변수들을 DataOutputStream을 통해 파일에 저장
	 * @param name 이름
	 * @param kor 국어점수
	 * @param eng 영어점수
	 * @param math 수학점수
	 * @param sum 총합
	 * @param avg 평균
	 */
	public void saveScore(String name, int kor, int eng, int math
							, int sum, double avg) {
		File f = new File(path, fileName);
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(f, true))) {
			
			// ~~각 데이터 타입별로 출력~~
			dos.writeUTF(name);	// => 한글이 포함될 수 있으므로 writeUTF() 사용
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 파일을 DataInputStream을 통해 읽어옴
	 * @return 입력 스트림 객체
	 * @throws FileNotFoundException
	 */
	public DataInputStream readScore() throws FileNotFoundException {
		File f = new File(path, fileName);
		return new DataInputStream(new FileInputStream(f));
	}
}
