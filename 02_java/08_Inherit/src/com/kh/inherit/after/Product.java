package com.kh.inherit.after;

public class Product {

	// 필드
	private String brand;
	private String code;
	private String name;
	private int price;
	
	
	// 생성자
	public Product() {}

	public Product(String brand, String code, String name, int price) {
		super();
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String information() {
		String info = String.format("브랜드 : %s, 품번 : %s, 품명 : %s, 가격 : %d",
				brand, code, name, price);
		return info;
	}
	
	// getter, setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
