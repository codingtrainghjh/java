package com.yedam.java.ch0701;

public class Phone {
	String model;
	String color;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		
	}
	
	final void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	final void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	protected void bell() {
		System.out.println("���� �︮�� ������ ����ŵ�ϴ�.");
	}
	protected void call() {
		System.out.println("��ȭ�� �մϴ�.");
	}

}
