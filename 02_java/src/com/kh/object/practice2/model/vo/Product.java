package com.kh.object.practice2.model.vo;

public class Product {

	// 필드
	private String productName;
	private int price;
	private String brand;
	
	// 생성자
	public Product() {}
	
	// 메소드
	// get(조회용) / set(변경용)

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void information() {
		System.out.printf("브랜드명 : %s | 제품명 : %s | 가격 : %d", brand, productName, price);
	}
}

