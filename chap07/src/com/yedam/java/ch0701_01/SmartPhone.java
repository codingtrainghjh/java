package com.yedam.java.ch0701_01;

import com.yedam.java.ch0701.Phone;

public class SmartPhone extends Phone{
	
	//��Ӱ���� ������� �ʿ�
	public SmartPhone(String model, String color) {
		super(model, color);
		
	}
	
	
	@Override
	protected void bell() { //Ȥ�� public -> �޼ҵ带 ������ �� ���� �� �̻��� ������ �ο������ ��
		super.bell();
		System.out.println("���Ҹ� : ���� - that that!");
	}

	@Override
	public void call() {
		super.call();
		System.out.println("�ȳ� ���� : ��ȭ�� ��Ǹ� ������");
	}
	
	
	

}
