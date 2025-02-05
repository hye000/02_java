package practice_object;

public class Dog {

	// [데이터(변수)]
	// 이름 : 문자열
	// 나이 : 정수형
	// 성별 : 문자
	// 종류 : 문자열
	String name;
	int age;
	char gender;
	String kind;
	
	// [생성자]
	public Dog(String n, int a, char g, String k) {
		name = n;
		age = a;
		gender = g;
		kind = k;
	}
	
	// public Dog() {} => 기본 생성자 형태를 정의
	
	// [기능(메소드)]
	// 짖기 : "xx가 왈왈 짖는다" 출력
	public void barks() {
		System.out.println(name + "가 왈왈 짖는다.");
	}
	// 밥 먹기 : "xx가 xxx를 먹는다." 출력
	public void eat(String food) {
		System.out.println(name + "가" + food + "을(를) 먹는다");
	}
	// 뛰기 : "xx가 폴짝뛴다" 출력
	// 똥싸기 : ...?


	public class Run{
		public static void main(String[] args) {
			
			//Dog클래스 형태의 변수 선언
			Dog d1;
			
			// Dog 인스턴스 생성 및 할당
			d1 = new Dog("꼬망", 15, '여', "믹스견");
			
			// "꼬망이가 짖는다" 출력
			d1.barks();
			
			// "꼬망이가 고구마를 먹는다" 출력
			d1.eat("고구마");
		}
	}
	
}