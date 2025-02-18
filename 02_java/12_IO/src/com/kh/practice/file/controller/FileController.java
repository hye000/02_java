package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {

	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	/*
	 * file 파일명
	 * sb 저장할 내용
	 */
	public void fileSave(String file, String sb) {
		fd.fileSave(file, sb);
	}
	
	public String fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	/*
	 * file 파일명
	 * sb 추가할 내용
	 */
	public void fileEdit(String file, String sb) {
		fd.fileEdit(file, sb);
	}
}
