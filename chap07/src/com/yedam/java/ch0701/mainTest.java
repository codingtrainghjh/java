package com.yedam.java.ch0701;

public class mainTest {

	public static void main(String[] args) {
		DmbPhone dmbPhone = new DmbPhone("�����̵���", "�Ķ�");
		
		System.out.println("�� : " + dmbPhone.model);
		System.out.println("���� : " + dmbPhone.color);
		System.out.println("ä�� : " + dmbPhone.ch);
		
		dmbPhone.powerOn();
		dmbPhone.bell();
		dmbPhone.call();
		
		dmbPhone.turnOnDmb();
	}

}
