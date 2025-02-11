package com.kh.inherit.after;

public class Desktop extends Product{

	private boolean allInOne;
	
	public Desktop() {}

	// alt + shift + s -> constructor에서 생성자 설정 가능함
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		super(brand, code, name, price);
		// => 부모클래스(Product)의 매개변수가 4개인 생성자 실행(호출)
		this.allInOne = allInOne;
	}
	
	@Override		// Override 어노테이션 => 오버라이딩 된 메소드 표시
					// 오버라이드 시에 반환형, 매개변수 정보 동일하게
	public String information() {
		return super.information() + ", 올인원 타입 : " + allInOne;
		// => super.information() 부모 클래스에 정의된 information 메소드 호출(실행)
//		 return getBrand() + getCode() + getName() + getPrice() + allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}
//	boolean 타입의 필드 getter 메소드 명은 is필드명() 으로 작성됨
//	public boolean getAllInOne() {
//		return this.allInOne;
//	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

}
