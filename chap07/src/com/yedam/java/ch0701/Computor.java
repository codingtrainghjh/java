package com.yedam.java.ch0701;

public class Computor extends Calculator {
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü");
		return Math.PI * r * r;
	}
	void print() {
		super.areaCircle(5);
		areaCircle(5);
	}
}
