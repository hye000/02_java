package com.kh.practice2.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {
	private String path = "./resources/files/";
	private String fileName = "score.txt";
	
	public ScoreDAO() {
		File folder = new File(path);
		if (!folder.exists()) {
			if (!folder.mkdirs()) System.out.println("[ERROR] 폴더 초기화 실패 :" + path);
		}
		File file = new File(path, fileName);
		if (file.exists()) {
			file.delete();
		}
	}
	
	public void saveScore(String name, int kor, int eng, int math
							, int sum, double avg) {
		File f = new File(path, fileName);
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(f, true))) {
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public DataInputStream readScore() throws FileNotFoundException {
		File f = new File(path, fileName);
		return new DataInputStream(new FileInputStream(f));
	}
}
