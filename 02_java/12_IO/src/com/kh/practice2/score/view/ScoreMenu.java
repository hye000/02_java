package com.kh.practice2.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice2.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	/*
	 * 메인 메뉴 출력
	 */
	public void mainMenu() {

		while (true) {
			System.out.println("1. 성적 저장"); // ➔ saveScore()
			System.out.println("2. 성적 출력"); // ➔ readScore()
			System.out.println("9. 끝내기"); // ➔ “프로그램을 종료합니다.” 출력 후 종료
			// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
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

	/*
	 * 사용자에게 점수를 입력 받음
	 */
	public void saveScore() {
		int num = 0; // 학생 숫자를 나타낼 변수
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
			

			// ScoreController(scr)의 saveScore() 매개변수로 모두 넘겨 주고
			// 그 학생 점수의 합계와 평균도 함께 매개변수로 넣어줌
			int total = kor + eng + math;
			scr.saveScore(name, kor, eng, math, total, total / 3);

			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			// N이나 n을 입력하지 않으면 이름 및 점수를 받는 것을 반복함
			// N이나 n을 입력하면 사용자에게 받는 반복문을 나감
			char yn = sc.next().charAt(0);
			sc.nextLine();	// 반복 시 버퍼 비우기위해!

			if (yn == 'n' || yn == 'N')
				return;
		}

	}

	/*
	 * 저장된 점수 출력
	 */
	public void readScore() {
		int count = 0; // 몇 명의 학생인지(반복문이 몇 번 실행됐는지) 담을 변수
		int sumAll = 0;
		double avgAll = 0.0; // 모든 학생들의 합과 평균을 담을 변수

		try {
			// scr의 readScore()의 반환 값을 DataInputStream에 담고 반복문을 이용하여
			DataInputStream data = scr.readScore();
			// 안에 들어가있는 데이터를 가지고 와서 출력
			// 모든 파일이 읽어졌을 때 나오는 EOFException을 이용하여
			// EOFException가 일어났을 때 읽은 회수, 전체 합계, 전체 평균 출력
			System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\n");
			while(true) {
				
				// 출력할 때와 같은 순서로 입력받아와야 함!
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
			// 출력될 수 있으므로 생략!
		} catch (IOException e) {
			e.printStackTrace(); // => 이쪽으로 온다면 문제가 있을것임!!
		}
		avgAll /= count;
		System.out.println("읽은 횟수 전체 합계 전체 평균");
		System.out.printf("%d\t%d\t%f\n", count, sumAll, avgAll);
	}
}
