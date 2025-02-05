package practice;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
//		practice1();
//		practice2();
//		practice3();
//		practice4();
//		practice5();
//		practice6();
//		practice7();
//		practice8();
//		practice9();
//		practice10();
//		practice11();
//		practice12();
//		practice13();
//		practice14();

	}

	public static void practice1() {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=1; i<=num; i++) {
			System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해 주세요.");
		}
	}
	
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num>=1) {
			for(int i=1; i<=num; i++) {
			System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해 주세요.");
		}
		} while(num < 1);
		
	}
	

	public static void practice3() {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=num; i>=1; i--) {
				System.out.printf("%d ",i);
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num>=1) {
			for(int i=num; i>=1; i--) {
				System.out.printf("%d ",i);
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		}while(num<1);
	
	}

	public static void practice5() {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int total = 0;
		
		for(int i=1; i<=num; i++) {
			total += i;
			System.out.print(i);
			
			if(i < num) {
				System.out.print("+");
			}
		}
		System.out.printf(" = %d",total);
	}

	public static void practice6() {
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			if(num1 > num2) {
				for(int i=num2; i<=num1; i++) {
					System.out.print(i + " ");
				}
			}
			if(num2 > num1) {
				for(int i=num1; i<=num2; i++) {
					System.out.print(i + " ");
				}
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
	}

	public static void practice7() {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		do {
		System.out.print("첫 번째 숫자 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			if(num1 > num2) {
				for(int i=num2; i<=num1; i++) {
					System.out.print(i + " ");
				}
			}
			if(num2 > num1) {
				for(int i=num1; i<=num2; i++) {
					System.out.print(i + " ");
				}
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	} while(num1<1 || num2<1);
	}

	public static void practice8() {
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.printf("===== %d단 =====\n",num);
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n",num, i, num*i);
		}
	}
	
	public static void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		
		for(int i=num; i<10; i++) {
			System.out.printf("===== %d단 =====\n",i);
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
		if(num>9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}
	
	public static void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
		System.out.print("숫자 : ");
		num = sc.nextInt();
		
		
		for(int i=num; i<10; i++) {
			System.out.printf("===== %d단 =====\n",i);
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
		if(num>9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
		} while(num>9);
	}
	
	public static void practice11() {
		// 사용자로부터 시작 숫자와 공차를 입력 받아
		// 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		// 단, 출력되는 숫자는 총 10개입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int diff = sc.nextInt();
		int step = 0;
		int sum = num;
		
		while(true) {
			if(step < 10) {
				System.out.print(sum + " ");
				sum += diff;
				step ++;
			} else {
				break;
			}
		}
	}
	
	public static void practice12() {
		
		Scanner sc = new Scanner(System.in);
		String oper;
		int num1;
		int num2;
		
		while(true){
		System.out.print("연산자(+, -, *, /, %) : ");
		oper = sc.next();
		if(oper.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		System.out.print("정수 1 : ");
		num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		num2 = sc.nextInt();
		
		switch(oper) {
			case "+" :
				System.out.printf("%d %s %d = %d\n",num1, oper, num2, num1 + num2);
				break;
				
			case "-" :
				System.out.printf("%d %s %d = %d\n",num1, oper, num2, num1-num2);
				break;
				
			case "*" :
				System.out.printf("%d %s %d = %d\n",num1, oper, num2, num1*num2);
				break;
				
			case "/" :
				if(num1 == 0 || num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else {
				System.out.printf("%d %s %d = %d\n",num1, oper, num2, num1/num2);
				}
				break;
				
			case "%" :
				System.out.printf("%d %s %d = %d\n",num1, oper, num2, num1%num2);
				break;	
				
				default : 
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public static void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");	
			}System.out.println();
		}
	}

	public static void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<=num; i++) {
			for(int j=num; j>i; j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
