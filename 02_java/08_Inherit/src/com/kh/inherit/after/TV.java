package com.kh.inherit.after;

public class TV extends Product{

	private int inch;
	
	public TV() {}
	
	public TV(String brand, String code, String name, int price, int inch) {
		super(brand, code, name, price);
		this.inch = inch;
	}
	
	// alt + shift + s -> v	
	@Override
	public String information() {
		return super.information() + ", 인치 : " + inch;
	}
//	public String information() {
//	return super.information() + "인치 : " + inch;
//}

	public int getInch() {
		return this.inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
}
