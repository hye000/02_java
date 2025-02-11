package com.kh.inherit.after;

public class Run {

	public static void main(String[] args) {
		Desktop dt = new Desktop("LG", "Lg-001", "LG gram", 1000000, true);
		System.out.println(dt.information());
		
		TV tv = new TV("Samsung", "ss-201", "LED TV", 2000000, 50);
		System.out.println(tv.information());
		

	}

}
