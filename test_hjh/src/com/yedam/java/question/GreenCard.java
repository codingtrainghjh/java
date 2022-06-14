package com.yedam.java.question;

public class GreenCard implements Payment{
	private String name;
	private String grade;
	private double saleRatio;
	private int point;
	private double pointRatio;
	
	public GreenCard() {
		this.name = "GreenCard";
		this.grade = "Sliver";
		this.point = 0;
		this.pointRatio = 0.05;
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
		System.out.println("====== 카드 정보 ======");
		System.out.println("카드명 : " + name);
		System.out.println("적용 등급 : " + grade);
		System.out.println("할인율 : " + saleRatio);
		System.out.println("포인트 적립률 : " + pointRatio);
		System.out.println("적립 포인트 : " + point);
		
	}

}
