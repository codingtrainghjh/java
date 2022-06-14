package com.yedam.java.example1;

public class Gold extends Customer {
	double discount; //할인율
	
	public Gold(int customerId, String customerName) {
		super(customerId, customerName);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.discount = 0.1;
	}

	
	@Override
	public int calcPrice(int price) {
		//1. 보너스 포인트 적립
		this.bonusPoint += price * this.bonusRatio;
		System.out.println("가격은 " + price + "원 입니다.");
		System.out.println("적립된 포인트는 " + bonusPoint + "원 입니다.");
		//2. 할인율이 적용된 가격
		return (int)(price * (1-this.discount));
	
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
}