package com.yedam.java.ch0703;

public abstract class Phone {
	// �ʵ�
	public String model;
	public String color;

	// ������
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;

	}

	// �޼ҵ�
	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	public void powerOff() {
		System.out.println("������ �����մϴ�.");
	}

	public abstract void bell();

}
