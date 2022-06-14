package com.yedam.java.example1;

public class Gold extends Customer {
	double discount; //������
	
	public Gold(int customerId, String customerName) {
		super(customerId, customerName);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.discount = 0.1;
	}

	
	@Override
	public int calcPrice(int price) {
		//1. ���ʽ� ����Ʈ ����
		this.bonusPoint += price * this.bonusRatio;
		System.out.println("������ " + price + "�� �Դϴ�.");
		System.out.println("������ ����Ʈ�� " + bonusPoint + "�� �Դϴ�.");
		//2. �������� ����� ����
		return (int)(price * (1-this.discount));
	
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
}