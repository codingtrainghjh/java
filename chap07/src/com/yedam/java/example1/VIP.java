package com.yedam.java.example1;

public class VIP extends Customer {
	String counseler; // 상담원
	double discount; // 할인율

	public VIP(int customerId, String customerName, String counseler) {
		super(customerId, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.discount = 0.15;
		this.counseler = counseler;
	}
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		System.out.println("가격은 " + price + "원 입니다.");
		System.out.println("적립된 포인트는 " + bonusPoint + "원 입니다.");
		return price - (int) (price * discount);
		
	}

	@Override
	public String showInfo() {
		return super.showInfo() + "\n" + "담당 상담원은 " + counseler + "입니다.";
	}
	public String getCounseler() {
		return counseler;
	}
	
	public void setCounseler(String counseler) {
		this.counseler = counseler;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
}