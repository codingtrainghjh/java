package com.yedam.java.ch0902;

public class RemoteControlTest {

	public static void main(String[] args) {
		Product product = new Product();
		
		//�ʵ� - �͸� ���� ��ü
		product.field.turnOn();
		product.field.turnOff();
		
		System.out.println();
		//���ú��� - �͸� ���� ��ü
		product.method1();
		
		System.out.println();
		//�Ű����� - �͸� ���� ��ü
		product.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("��Ʈ���� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("��Ʈ���� ���ϴ�.");
			}
			
		});
	}

}
