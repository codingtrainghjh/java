package com.yedam.java.ch0703;

public class DmbPhone extends Phone {

	public DmbPhone(String model, String color) {
		super(model, color);
	}

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}

	public void showDmb() {
		System.out.println("DMB�� �����մϴ�.");
	}
	@Override
	public void bell() {
		System.out.println("���� �︳�ϴ�.");
		System.out.println("�층~�층~");
	}
}
