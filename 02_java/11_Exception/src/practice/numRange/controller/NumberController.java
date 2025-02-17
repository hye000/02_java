package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {

	public NumberController() {}
	public boolean checkDouble(int num1, int num2) throws NumRangeException{
		boolean input = (1<num1 && num1<100) && (1<num2 && num2<100);
		if(input == false) {
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		}
		
		boolean result = false;
		
			if(num1 % num2 == 0) {
				result = true;
			} else {
				result = false;
			}
	
		return result;
	}
}
