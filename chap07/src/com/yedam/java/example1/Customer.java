package com.yedam.java.example1;

public class Customer {
	//�ʵ�
	int customerId; //�����̵�
	String customerName; //�� �̸�
	String customerGrade; // �� ���
	int bonusPoint; //���ʽ� ����Ʈ
	double bonusRatio; //���ʽ� ����Ʈ ������
	
	
	//������
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	
	//�޼ҵ�
	public int calcPrice(int price) {

		this.bonusPoint += price * this.bonusRatio;
		System.out.println("������ " + price + "�� �Դϴ�.");
		System.out.println("������ ����Ʈ�� " + bonusPoint + "�� �Դϴ�.");
		return price;
	}
	public String showInfo() {
		return customerName + "���� ����� "
				+ customerGrade + "�̸�, ���ʽ� ����Ʈ�� "
				+ bonusPoint + "�Դϴ�.";
		
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
