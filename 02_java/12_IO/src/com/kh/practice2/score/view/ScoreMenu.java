package com.kh.practice2.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice2.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() {

		while (true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				saveScore();
			} else if (menu == 2) {
				readScore();
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}


	public void saveScore() {
		int num = 0; 
		while (true) {
			num++;
			System.out.println(num + "번 째 학생 정보 기록");
			System.out.print("이름 : ");
			String name = sc.nextLine();

			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();

			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();

			System.out.print("수학 점수 : ");
			int math = sc.nextInt();

			int total = kor + eng + math;
			scr.saveScore(name, kor, eng, math, total, total / 3);

			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char yn = sc.next().charAt(0);
			sc.nextLine();

			if (yn == 'n' || yn == 'N')
				return;
		}

	}


	public void readScore() {
		int count = 0;
		int sumAll = 0;
		double avgAll = 0.0; 

		try {
			DataInputStream data = scr.readScore();
			System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\n");
			while(true) {
				String name = data.readUTF();
				int kor = data.readInt();
				int eng = data.readInt();
				int math = data.readInt();
				int sum = data.readInt();
				double avg = data.readDouble();
				
				sumAll += sum;
				avgAll += avg;
				
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",
								name, kor, eng, math, sum, avg);
				count++;
			}
		} catch (EOFException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		avgAll /= count;
		System.out.println("읽은 횟수 전체 합계 전체 평균");
		System.out.printf("%d\t%d\t%f\n", count, sumAll, avgAll);
	}
}
