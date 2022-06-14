package com.yedam.example1;

public class Subway {
	//필드
	 //탑승지역, 요금정보, 탑승객 수, 지불
	private String lineNumber;
	private int money;
	private	int passengerCount;
	private int pay;
	//생성자
	public Subway(String lineNumber, int pay) { //호선과 금액 받는곳
		this.lineNumber = lineNumber;
		this.pay = pay;
	}
	//메서드
	public int getPay() { //금액지불
		return pay;
		
	}
	public void take(int money) { //수입
		this.money += money;
		this.passengerCount++;
		
	}
	public void showInfo() {
		System.out.print(lineNumber + "의 승객은 ");
		System.out.print(passengerCount + "명이고, 수입은 ");
		System.out.println(money + "원 입니다.");
		
	}

}
