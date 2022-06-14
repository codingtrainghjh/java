package com.yedam.example2;

public class Card {
	//필드
     //1100번부터 번호발급
	private static int serialNum = 1100;
	
	private int cardnum; // 카드번호
	private String name; // 이름
	//생성자
	public Card(String name) {
		serialNum++;
		this.cardnum = serialNum; //카드번호를 복사해둠
		this.name = name;
		
	}
	//메소드
	public static int getserialNum() { // 시리얼넘버 부여
		return serialNum;
	}
	public int getCardNum() {
		return cardnum;
		
	}
	public String getName() {
		return name;
	}
}
