package com.yedam.java.question;

public class VIPCard implements Payment{
	private String name;
	private String grade;
	private double saleRatio;
	private int point;
	private double pointRatio;
	
	public VIPCard() {
		this.name = "VIPCard";
		this.grade = "Gold";
		this.saleRatio = 0.1;
		this.point = 0;
		this.pointRatio = 0.03;
	}
	@Override
	public int offline(int price) {
		
		this.point = (int) ((int)price*pointRatio);
		return (int) (price *(1-saleRatio - OFFLINE_PAYMENT_RATIO));
	}

	@Override
	public int online(int price) {
		
		this.point = (int) ((int)price*pointRatio);
		return (int) (price *(1-saleRatio-ONLINE_PAYMENT_RATIO));
	}

	@Override
	public int simple(int price) {
		
		this.point = (int) ((int)price*pointRatio);
		return (int) (price *(1-saleRatio-SIMPLE_PAYMENT_RATIO));
	}

	@Override
	public void showCardInfo() {
		System.out.println("====== ī�� ���� ======");
		System.out.println("ī��� : " + name);
		System.out.println("���� ��� : " + grade);
		System.out.println("������ : " + saleRatio);
		System.out.println("����Ʈ ������ : " + pointRatio);
		System.out.println("���� ����Ʈ : " + point);
		
	}

}
