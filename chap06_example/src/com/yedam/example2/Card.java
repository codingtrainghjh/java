package com.yedam.example2;

public class Card {
	//�ʵ�
     //1100������ ��ȣ�߱�
	private static int serialNum = 1100;
	
	private int cardnum; // ī���ȣ
	private String name; // �̸�
	//������
	public Card(String name) {
		serialNum++;
		this.cardnum = serialNum; //ī���ȣ�� �����ص�
		this.name = name;
		
	}
	//�޼ҵ�
	public static int getserialNum() { // �ø���ѹ� �ο�
		return serialNum;
	}
	public int getCardNum() {
		return cardnum;
		
	}
	public String getName() {
		return name;
	}
}
