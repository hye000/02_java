package practice3.model.vo;

public abstract class Animal {
// 접근제한자 예약어 class 클래스명
// 추상 클래스는 인스턴스 생성할 수 없음. 참조자료형으로는 사용할 수 있음
	
	private String name;
	private String kinds;
	
	// protected 접근제한자를 사용하여 생성자를 정의하게 되면 해당 클래스는
	// 같은 패키지 내에서 또는 상속 관계에서만 인스턴스를 생성할 수 있음
	// 현재 클래스는 추상 클래스로 직접 생성이 불가하기 때문에
	// 이 클래스를 상속받은 클래스에서만 생성자를 사용할 수 있다
	protected Animal() {}
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다. ";
	}
	// toString()는 Object 클래스에 정의되어 있는 메소드
	// 오버라이딩 되어 현재 클래스에서 재정의 됨
	// 보통 현재 클래스의 모든 필드의 정보를 문자열로 반환하는 역할을 하도록 함
	
	public abstract void speak();
	// 접근제한자 예약어 반환형 메소드명(매개변수정보);
	// abstract 키워드가 사용되면 추상 메소드가 됨(구현부가 없음)
}
