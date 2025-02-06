package com.kh.object.practice2.run;

import com.kh.object.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p1 = new Product();
		
		//setter 메소드를 통해 값을 저장
		p1.setProductName("모니터");
		p1.setPrice(500000);
		p1.setBrand("삼성");
		
		p1.information();
	}

}
