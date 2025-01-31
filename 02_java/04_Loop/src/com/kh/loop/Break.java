package com.kh.loop;

public class Break {

	/*
	 * 분기문 : break
	 * 반복문 안에서 사용 시 가장 가까운 반복문을 종료시킨다
	 */
	
	public static void main(String[] args) {
		// 랜덤값 (1~100)을 추출하여 출력
		// 해당 랜덤값이 짝수일 때 반복문 종료
		
		while(true) {		// 조건식 위치에 true라고 지정하면 -> 무한루프
			int random = (int)(Math.random()*100+1);
			
			if(random % 2 ==0) {
				System.out.println("종료 -> " + random);
				break;
			}
			System.out.println(random);
		}

	}

}
