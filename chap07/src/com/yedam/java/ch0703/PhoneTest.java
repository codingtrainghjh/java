package com.yedam.java.ch0703;

public class PhoneTest {

	public static void main(String[] args) {
		/*
		 * Phone phone = new Phone("Z�ø�", "��"); phone.powerOn();
		 */

		DmbPhone dmbPhone = new DmbPhone("Z�ø�", "��");
		dmbPhone.powerOn();
		dmbPhone.showDmb();
	}

}
