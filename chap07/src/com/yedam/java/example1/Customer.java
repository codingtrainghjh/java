package com.yedam.java.example1;

public class Customer {
	//필드
	int customerId; //고객아이디
	String customerName; //고객 이름
	String customerGrade; // 고객 등급
	int bonusPoint; //보너스 포인트
	double bonusRatio; //보너스 포인트 적립율
	
	
	//생성자
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	
	//메소드
	public int calcPrice(int price) {

		this.bonusPoint += price * this.bonusRatio;
		System.out.println("가격은 " + price + "원 입니다.");
		System.out.println("적립된 포인트는 " + bonusPoint + "원 입니다.");
		return price;
	}
	public String showInfo() {
		return customerName + "님의 등급은 "
				+ customerGrade + "이며, 보너스 포인트는 "
				+ bonusPoint + "입니다.";
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}


}
