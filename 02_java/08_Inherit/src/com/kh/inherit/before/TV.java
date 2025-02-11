package com.kh.inherit.before;

public class TV {

	private String brand;
	private String code;
	private String name;
	private int price;
	private int inch;
	
	public TV() {}

	public TV(String brand, String code, String name, int price, int inch) {
		super();
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.inch = inch;
	}
	
	public String information() {
		String info = String.format("브랜드 : %s, 품번 : %s, 품명 : %s, 가격 : %d, 인치 : %d",
				brand, code, name, price, inch);
		return info;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName(String name) {
		return this.name;
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

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
}
