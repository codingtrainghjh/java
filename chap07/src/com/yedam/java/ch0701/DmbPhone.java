package com.yedam.java.ch0701;

public class DmbPhone extends Phone{ //extends = ���
	int ch;


	
	public DmbPhone(String model, String color){
		//super(); //�ڹ� ������ ���� ������ ȣ�� ����, Ŭ���� ������ �θ�� ����
		//�����ڰ� �� �̻��� ��� �ڹٴ� ���� ���ϹǷ� �����ڰ� ������ �־�� ��
		super(model, color);
		//super.model = model;
		//super.color = color;
		//Ŭ������ �ƴ� �ν��Ͻ��� �����ϱ� ���� this�� ��
		this.ch = 10;
	}
	
	void turnOnDmb() {
		System.out.println("ä�� " + ch + "�� ��� ������ �����մϴ�.");
	}
	void turnOffDmb() {
		System.out.println("��� ������ �����մϴ�.");
	}
	void changeChannel(int ch) {
		this.ch = ch;
		System.out.println("ä�� " + ch + "������ ��ȯ�մϴ�.");
	}
}
