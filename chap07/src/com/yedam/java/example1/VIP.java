package com.yedam.java.example1;

public class VIP extends Customer {
	String counseler; // ����
	double discount; // ������

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
		System.out.println("������ " + price + "�� �Դϴ�.");
		System.out.println("������ ����Ʈ�� " + bonusPoint + "�� �Դϴ�.");
		return price - (int) (price * discount);
		
	}

	@Override
	public String showInfo() {
		return super.showInfo() + "\n" + "��� ������ " + counseler + "�Դϴ�.";
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