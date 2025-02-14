package com.kh.inter.ex2;

public class Circle implements Shape{
	// Shape 인터페이스를 구현
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}
	
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
